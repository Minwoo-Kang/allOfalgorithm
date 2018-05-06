package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_2178 {
    static int visited[][];
    static int map[][];
    static int direction[][] = {{-1,0},{0,-1},{1,0},{0,1}};
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new int [N][M];
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j <M; j++) {
                map[i][j] = line.charAt(j)-'0';
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<Point> queue = new LinkedList<>();

        visited[0][0] = 1;
        queue.add(new Point(0,0));

        while (!queue.isEmpty()){
            Point p = queue.poll();
            for (int i = 0; i < direction.length; i++) {
                int nextX = p.x + direction[i][0];
                int nextY = p.y+ direction[i][1];

                if (nextX >=0 && nextX < N && nextY >=0 && nextY <M){
                    if(visited[nextX][nextY]==0 && map[nextX][nextY] ==1) {
                        visited[nextX][nextY] = visited[p.x][p.y] + 1;
                        queue.add(new Point(nextX, nextY));
                    }
                }
            }
            if (visited[N-1][M-1]!=0)
                return visited[N-1][M-1];
        }
        return 0;
    }

    static class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
