package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_1037 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max = -1;
        int num;
        while(st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }
        System.out.println(min*max);
    }
}
