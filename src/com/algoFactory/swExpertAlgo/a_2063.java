package com.algoFactory.swExpertAlgo;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a_2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <N ; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        System.out.println(nums[N/2]);
    }
}
