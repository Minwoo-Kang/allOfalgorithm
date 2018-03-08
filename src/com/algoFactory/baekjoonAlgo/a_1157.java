package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());
        int []arr = new int [26];
        int max = 0;
        boolean sameValue = false;
        for (int i = 0; i < sb.length(); i++) {
            arr[(sb.charAt(i) - 'A')%32]++;
        }
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] == arr[max])
                sameValue = true;

            if (arr[i]>arr[max]) {
                max = i;
                sameValue = false;
            }

        }
        if (sameValue)
            System.out.println("?");
        else
            System.out.println((char)('A'+max));

    }
}
