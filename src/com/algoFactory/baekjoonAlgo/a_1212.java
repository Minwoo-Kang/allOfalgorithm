package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_1212 {
    private static final String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
    private static final String[] first = {"", "1", "10", "11", "100", "101", "110", "111"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer N = new StringBuffer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int val =  (N.charAt(0) - '0');

        if (val == 0)
            System.out.println(0);
        else {
            sb.append(first[val]);
            for (int i = 1; i < N.length(); i++) {
                val =  (N.charAt(i) - '0');
                sb.append(binary[val]);
            }
            System.out.println(sb.toString());
        }
    }
}
