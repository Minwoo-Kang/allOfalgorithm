package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class a_1890 {
    static long[][] visited;
    static int[][] map;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new long[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int jump = map[i][j];
                int nextX = i+jump;
                int nextY = j+jump;

                if (visited[i][j]==0)
                        continue;

                if (jump==0)
                        continue;

                if (nextX<N)
                    visited[nextX][j] +=visited[i][j];
                if (nextY<N)
                    visited[i][nextY] += visited[i][j];
            }
        }

        System.out.println(visited[N-1][N-1]);

    }
}
