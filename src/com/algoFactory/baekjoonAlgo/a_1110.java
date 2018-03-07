package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_1110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt=1;
        //int rightNumber = N%10;
        int rightNumber = (N/10 + N%10) % 10;
        int leftNumber = N % 10 * 10;
        int nextNumber = leftNumber+ rightNumber  ;
        while (nextNumber!=N){
            rightNumber = (nextNumber/10 + nextNumber%10 ) % 10;
            leftNumber = nextNumber %10 * 10;
            nextNumber = leftNumber + rightNumber;
            cnt++;
        }
        System.out.println(cnt);
    }
}
