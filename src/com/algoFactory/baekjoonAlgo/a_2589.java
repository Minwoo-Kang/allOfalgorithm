package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_2589 {
    static int map[][];
    static int visited[][];

    static int[] directionX = {-1, 0, 1, 0};
    static int[] directionY = {0, 1, 0, -1};

    static int result =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            String string = new String(br.readLine());
            for (int j = 0; j < M; j++) {
                char ch = string.charAt(j);
                if (ch == 'W')
                    map[i][j] = 0;
                else if (ch == 'L')
                    map[i][j] = 1;
            }
        }

        Queue<Node> nodeQueue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {

                    for (int k = 0; k < N; k++) {
                        for (int l = 0; l < M; l++) {
                            visited[k][l]=0;
                        }
                    }

                    visited[i][j] = 1;
                    nodeQueue.add(new Node(i, j,0));

                    while (!nodeQueue.isEmpty()) {   //find the most far-away node
                        Node node = nodeQueue.poll();
                        if (node.depth > result)
                            result = node.depth;

                        for (int k = 0; k < 4; k++) {
                            int nextX = node.x + directionX[k];
                            int nextY = node.y + directionY[k];

                            if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M)
                                continue;

                            if (map[nextX][nextY] == 1 && visited[nextX][nextY] == 0) {
                                visited[nextX][nextY] = 1;
                                nodeQueue.add(new Node(nextX, nextY,node.depth+1));
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }

    private static class Node {
        int x;
        int y;
        int depth;

        public Node(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
}
