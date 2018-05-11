package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        int level = 1;

        if (N==1) {
            System.out.println("1/1");
            return;
        }
        while (num < N){
            level++;
            num +=level;
        }

        int rest = N - (num - level) -1;
        if (level%2!=0){  //start from left
            System.out.printf("%d/%d",level-rest,1+rest);
        }else{  //start from top
            System.out.printf("%d/%d",1+rest,level-rest);
        }
    }
}
