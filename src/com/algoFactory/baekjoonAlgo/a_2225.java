package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_2225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] count = new long[K + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            count[1][i] = 1;
        }
        for (int i = 2; i <= K; i++) {
            for (int j = 0; j <= N; j++) {
                for (int l = 0; l <= j; l++) {
                    if(count[i][j] + count[i - 1][j - l] > 1000000000){
                        count[i][j] = count[i][j] + count[i - 1][j - l] % 1000000000;
                    }else
                        count[i][j] += count[i - 1][j - l];
                }
            }
        }
        System.out.println(count[K][N]% 1000000000);
    }
}