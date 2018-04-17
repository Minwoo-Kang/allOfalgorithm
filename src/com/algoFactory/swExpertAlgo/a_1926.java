package com.algoFactory.swExpertAlgo;

import java.io.*;

public class a_1926 {
    private static int count369(int n){
        int val,cnt =0;
        while (n!=0){
            val = n%10;
            if (val==3 || val==6 || val==9)
                cnt++;
            n/=10;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            if (count369(i)!=0){
                for (int j = 0; j <count369(i) ; j++) {
                    System.out.print("-");
                }
            }else
                System.out.print(i);
            System.out.print(" ");
        }

    }
}
