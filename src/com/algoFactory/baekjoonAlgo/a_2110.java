package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a_2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int result =0;
        int[] homes = new int[N];

        for (int i = 0; i < N; i++) {
            homes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(homes);

        int left = homes[0];
        int right = homes[N-1];

        while (left<=right){
            int mid = (left + right) /2;
            int cnt =1;
            int start = homes[0];

            for (int i = 1; i < N; i++) {
                if (homes[i] - start >= mid){
                    cnt++;
                    start = homes[i];
                }
            }

            if (cnt >= C){  //너무 간격이 가까워 공유기가 많이 설치되거나 or 더 가까운 최소 거리가 있을 수 있음
                left = mid+1;
                result = mid;
            }else   //너무 간격이 멀어 설치 갯수가 부족한 경우
                right = mid -1;
        }
        System.out.println(result);
    }
}
