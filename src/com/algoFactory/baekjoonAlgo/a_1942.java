package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_1942 {
    private static final int[] sumOfDay = {0,31,59,90,120,151,181,212,243,273,304,334};
    private static final String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int totalDay = sumOfDay[x-1] + y;
        System.out.println(day[(totalDay % 7) ]);
    }
}
