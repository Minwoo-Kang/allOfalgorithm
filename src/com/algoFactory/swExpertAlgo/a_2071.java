package com.algoFactory.swExpertAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        double sum;
        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                sum+= Integer.parseInt(st.nextToken());
            }
            System.out.println("#"+i+" "+ Math.round(sum/10));
        }
    }
}
