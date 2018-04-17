package com.algoFactory.swExpertAlgo;

import java.io.*;

public class a_2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((1+N)*N/2);
    }
}
