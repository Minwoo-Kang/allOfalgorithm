package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class a_1967 {
    static int map[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N+1][N+1];

        StringTokenizer st;
        int x,y,cost;
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            cost = Integer.parseInt(st.nextToken());

            map[x][y] = map[y][x] = cost;
        }


    }
}
