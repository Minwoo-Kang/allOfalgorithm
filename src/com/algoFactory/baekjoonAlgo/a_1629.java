package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class a_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println(solve(A,B,C));
    }

    private static long solve(int a, int b, int c) {
        if (b ==0)  return 1;
        if (b== 1)  return a%c;

        long halfPow = solve(a,b/2 , c);
        long result=0;
        if (b%2 ==0)
            result = (halfPow%c * halfPow%c) %c;
        else
            result = (halfPow%c * halfPow%c * a%c) %c;

        return result;
    }
}
