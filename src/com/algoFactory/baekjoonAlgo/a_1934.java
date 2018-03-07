package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_1934 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int a , b;
        StringTokenizer st;
        for (int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            int val1 = a , val2 = b;
            while (val1!=val2){
                if (val1>val2)
                    val2+=b;
                else if (val1<val2)
                    val1+=a;
            }
            System.out.println(val1);
        }
    }
}
