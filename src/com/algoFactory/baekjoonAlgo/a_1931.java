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

        Arrays.sort(conferences,(conference1 , conference2) -> conference1[1]==conference2[1] ? conference1[0]-conference2[0] : conference1[1]-conference2[1]); //끝나는 시간대로 정렬, 만약 같으면 시작 시간으로 정렬

        for (int i = 0; i < N; i++) {

            if (conferences[i][0] >= endTime){  //현재 기준시간 보다 시작 시간이 빠를 시 해당 회의를 선택.
                result++;
                endTime = conferences[i][1];    //회의를 선택하면 기준 시간이 선택한 회의의 종료 시점이 된다.
            }
        }

        System.out.println(result);
    }
}
