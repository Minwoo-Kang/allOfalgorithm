package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = new String(br.readLine());
        int testCase = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < testCase; i++) {
            String ringringString = new String(br.readLine());
            int correctCounter = 0;
            for (int index = 0; index < 20; index++) {
                if (ringringString.charAt(index % 10) == string.charAt(correctCounter)){
                    correctCounter++;
                }else{
                    correctCounter = 0;
                    if (ringringString.charAt(index % 10) == string.charAt(correctCounter))  correctCounter++;
                }

                if (correctCounter == string.length()){
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
