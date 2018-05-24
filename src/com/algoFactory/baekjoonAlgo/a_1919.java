package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string1 = new String(br.readLine());
        String string2 = new String(br.readLine());
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        int result = 0;

        for (int i = 0; i < string1.length(); i++) {
            str1[string1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < string2.length(); i++) {
            str2[string2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            result += Math.abs(str1[i] - str2[i]);
        }
        System.out.println(result);
    }
}
