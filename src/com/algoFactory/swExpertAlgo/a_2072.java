package com.algoFactory.swExpertAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class a_2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int sum;
        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                int val = Integer.parseInt(st.nextToken());
                if (val%2!=0)
                    sum +=val;
            }
            System.out.println("#"+i+" "+ sum);
        }
    }
}
