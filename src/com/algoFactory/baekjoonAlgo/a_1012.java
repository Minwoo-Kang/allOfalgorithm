package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_1012 {
    static int [][] map;
    static int count,N,M;
    static int[] directionX = {-1,0,1,0};
    static int[] directionY = {0,-1,0,1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            count =0;
            for (int j = 0; j < K; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(stringTokenizer.nextToken());
                int y = Integer.parseInt(stringTokenizer.nextToken());
                map[x][y] = 1;
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] == 1) {
                        count++;
                        bfs(j, k);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(new Node(x,y));
        map[x][y]=0;

        while (!nodeQueue.isEmpty()){
            Node node = nodeQueue.poll();

            for (int i = 0; i < directionX.length; i++) {
                int nextX = node.x + directionX[i];
                int nextY = node.y + directionY[i];

                if (nextX >=0 && nextX < N && nextY >=0 && nextY <M){
                    if (map[nextX][nextY]==1){
                        map[nextX][nextY] = 0;  //visit map[nextX][nextY];
                        nodeQueue.add(new Node(nextX,nextY));
                    }
                }
            }
        }
    }

    private static class Node {
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
