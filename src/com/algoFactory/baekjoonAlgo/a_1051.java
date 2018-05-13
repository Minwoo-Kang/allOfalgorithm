package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class a_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int maxArea =0;

        int [][]map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String string = new String(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = string.charAt(j) - '0';
                map[i][j] = num;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int pivot = map[i][j];
                for (int k = 0; k+j < M; k++) {
                    if (j+k <M && i+k <N ){
                        if (pivot==map[i][j+k] && pivot==map[i+k][j] && pivot==map[i+k][j+k]){
                            if (maxArea < Math.pow(k+1,2))
                                maxArea = (int)Math.pow(k+1,2);
                        }else
                            continue;
                    }else   //over the map or there is no pivot
                        continue;
                }
            }
        }

        System.out.println(maxArea);

    }
}
