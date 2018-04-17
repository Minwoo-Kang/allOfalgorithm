package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class a_14888 {
    static int plus_Num,minus_Num,multiple_Num,divide_Num , N;
    static int max = -1000000000,min = 1000000000;
    static int []numArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            numArr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        plus_Num = Integer.parseInt(st.nextToken());
        minus_Num = Integer.parseInt(st.nextToken());
        multiple_Num = Integer.parseInt(st.nextToken());
        divide_Num = Integer.parseInt(st.nextToken());

        dfs(1,0,0,0,0,numArr[0]);

        System.out.println(max);
        System.out.println(min);

    }

    private static void dfs(int dfs_cnt, int plus_num, int minus_num, int multiple_num, int divide_num, int total) {    //dfs_cnt == index of arr (started from 0)
        if (dfs_cnt == N){
            if (max < total)
                max = total;
            if (min > total)
                min = total;
        }

        if (plus_num < plus_Num)
            dfs(dfs_cnt+1,plus_num+1,minus_num,multiple_num,divide_num , total+ numArr[dfs_cnt]);
        if (minus_num < minus_Num)
            dfs(dfs_cnt+1,plus_num,minus_num+1,multiple_num,divide_num , total- numArr[dfs_cnt]);
        if (multiple_num < multiple_Num)
            dfs(dfs_cnt+1,plus_num,minus_num,multiple_num+1,divide_num , total* numArr[dfs_cnt]);
        if (divide_num < divide_Num)
            dfs(dfs_cnt+1,plus_num,minus_num,multiple_num,divide_num+1 , total/ numArr[dfs_cnt]);

    }
}
