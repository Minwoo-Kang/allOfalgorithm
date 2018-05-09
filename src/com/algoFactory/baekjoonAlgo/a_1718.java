package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_1718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = new String(br.readLine());
        String keyString = new String(br.readLine());

        for (int i = 0; i < inputString.length(); i++) {
            int ch = (int)inputString.charAt(i);
            int key = keyString.charAt(i%keyString.length());

            if (ch==' ')
                System.out.print(' ');
            else if (ch-key-1>=0)
                System.out.print((char)(ch+'a'-key-1));
            else
                System.out.print((char)(ch+26 +'a'-key-1));
        }
    }
}
