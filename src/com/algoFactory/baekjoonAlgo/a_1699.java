package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []dp = new int[100001];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j*j <=i; j++) {
                if(dp[i] > dp[i-(j*j)]+1 || dp[i]==0)
                    dp[i] = dp[i-(j*j)]+1;
            }
        }

        System.out.println(dp[N]);
    }
}
