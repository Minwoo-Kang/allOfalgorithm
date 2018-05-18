package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_2573 {
    static int[][]map;
    static int[][]visited;
    static int[][]meltingMap;
    static int level = 0;
    static int N,M;
    static int[] directionX = {-1,0,1,0};
    static int[] directionY = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];
        meltingMap = new int[N][M];
        int islandCount = 1;
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        meltMap();

        while (islandCount==1){
            islandCount = 0;
            for (int i = 1; i < N-1; i++) {
                for (int j = 1; j < M-1; j++) {
                    if (map[i][j]!=0 && visited[i][j]!=1) {
                        islandCount+=1;
                        if (islandCount>1){
                            System.out.println(level);
                            return;
                        }
                        visited[i][j]=1;
                        queue.add(new Node(i, j));
                        while (!queue.isEmpty()){
                            Node node = queue.poll();
                            for (int k = 0; k < directionY.length; k++) {
                                if (map[node.x+directionX[k]][node.y+directionY[k]] !=0 && visited[node.x+directionX[k]][node.y+directionY[k]]!= 1){
                                    visited[node.x+directionX[k]][node.y+directionY[k]] = 1;
                                    queue.add(new Node(node.x+directionX[k],node.y+directionY[k]));
                                }
                            }
                        }
                    }
                }
            }
            meltMap();
            visited = new int[N][M];
        }
        System.out.println(0);
    }

    private static void meltMap() {
        level++;
        meltingMap = new int[N][M];
        for (int i = 1; i < N-1; i++) {
            for (int j = 1; j < M-1; j++) {
               if (map[i][j]!=0){
                   for (int k = 0; k < directionX.length; k++) {
                       if (map[i+directionX[k]][j+directionY[k]]==0)
                           meltingMap[i][j]++;
                   }
               }
            }
        }

        for (int i = 1; i < N-1; i++) {
            for (int j = 1; j < M-1; j++) {
                if (meltingMap[i][j]!=0){
                    for (int k = 0; k < meltingMap[i][j]; k++) {
                        if (map[i][j]>0)
                            map[i][j]--;
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
