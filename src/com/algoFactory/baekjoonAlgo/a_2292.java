package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num1 = 1;
        int cnt = 0;

        while (num1 < N){
            cnt++;
            num1 +=6*cnt;
        }
        System.out.println(cnt+1);
    }
}
