package com.algoFactory.swExpertAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class a_1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int []arr = new int[n];

            for (int j=0;j<n;j++)
                arr[j] = Integer.parseInt(st.nextToken());

            int max = 0;
            int cost =0;
            for (int j=n-1; j>=0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                } else {
                    cost += (max-arr[j]);
                }
            }
            System.out.println("#"+i+" "+cost);
        }
    }
}
