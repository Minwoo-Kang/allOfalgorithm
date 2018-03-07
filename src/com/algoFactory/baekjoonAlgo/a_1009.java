package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_1009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int a,b;
        for (int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken()) % 10;
            b = Integer.parseInt(st.nextToken());

            if (a==0) {
                System.out.println(10);
                continue;
            }

            if (b ==0)
                System.out.println(1);
            else{
                if (b%4==0)
                    System.out.println((int)Math.pow(a,4) % 10);
                else
                    System.out.println((int)Math.pow(a,b%4) % 10);
            }
        }
    }
}
