package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_1309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long [][]dp = new long[N][3];

        dp[0][0] =1;
        dp[0][1] =1;
        dp[0][2] =1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==0)
                    dp[i][j] = (dp[i-1][1]+dp[i-1][2]) %9901 ;
                else if (j==1)
                    dp[i][j] = (dp[i-1][0]+dp[i-1][2]) %9901;
                else
                    dp[i][j] = (dp[i-1][0]+dp[i-1][2] + dp[i-1][1]) %9901;
            }
        }

        System.out.println((dp[N-1][0] + dp[N-1][1] + dp[N-1][2])%9901);
    }
}
