package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] conferences = new int[N][2];
        int result = 0;
        int endTime = -1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            conferences[i][0] = Integer.parseInt(st.nextToken());
            conferences[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(conferences,(conference1 , conference2) -> conference1[1]==conference2[1] ? conference1[0]-conference2[0] : conference1[1]-conference2[1]);

        for (int i = 0; i < N; i++) {

            if (conferences[i][0] >= endTime){
                result++;
                endTime = conferences[i][1];
            }
        }

        System.out.println(result);
    }
}
