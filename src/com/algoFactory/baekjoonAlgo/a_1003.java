package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_1003 {
    public static void main(String[] args) throws IOException{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int N;
        for(int i=0;i<T;i++){
            N = Integer.parseInt(br.readLine());
            countFibo(N);
        }
    }

    static void countFibo(int N){
        long []cntF1 = {1,0};
        long []cntF2 = {0,1};
        long []cntF3 = {0,0};
        if (N==0) System.out.println(cntF1[0]+" "+cntF1[1]);
        else if(N==1) System.out.println(cntF2[0]+" "+cntF2[1]);
        else{
            for(int i=2;i<=N;i++) {
                cntF3[0] = cntF1[0]+cntF2[0];
                cntF3[1] = cntF1[1]+cntF2[1];

                cntF1[0] = cntF2[0];
                cntF1[1] = cntF2[1];

                cntF2[0] = cntF3[0];
                cntF2[1] = cntF3[1];
            }
            System.out.println(cntF3[0]+" "+cntF3[1]);
        }
    }

}
