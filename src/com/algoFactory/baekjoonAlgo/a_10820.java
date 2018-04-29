package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int big, small, space, num;
        while (str != null) {
            big = 0;
            small = 0;
            space = 0;
            num = 0;
            for (int i = 0; i < str.length(); i++) {
                int ch = (int) str.charAt(i);
                if (ch >= 97 && ch <= 122)
                    small++;
                else if (ch >= 65 && ch <= 90)
                    big++;
                else if (ch >= 48 && ch <= 57)
                    num++;
            }

            System.out.printf("%d %d %d %d", small, big, num, str.length() - (small + big + num));
            System.out.println();
            str = br.readLine();
        }
    }
}
