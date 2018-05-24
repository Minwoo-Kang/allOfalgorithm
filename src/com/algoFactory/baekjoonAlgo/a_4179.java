package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_4179 {
    private static int[][] Map;
    private static int[][] Visited;
    private static int[] directionX = {-1,0,1,0};
    private static int[] directionY = {0,1,0,-1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map = new int[N][M];
        Visited = new int[N][M];
        int result = 0;
        Queue<Point> userPosition = new LinkedList<>();
        Queue<Point> firePosition = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String string = new String(br.readLine());
            for (int j = 0; j < M; j++) {
                char ch = string.charAt(j);
                if (ch=='#')    Map[i][j] = -1;
                else if (ch == 'J') {
                    userPosition.add(new Point(i,j));
                    Visited[i][j] = 1;
                }
                else if (ch == 'F'){
                    firePosition.add(new Point(i,j));
                    Map[i][j] = -1;
                }else   Map[i][j] = 0;
            }
        }

        while (!userPosition.isEmpty()){
            int userQueueSize = userPosition.size();
            int fireQueueSize = firePosition.size();

            while (fireQueueSize!=0){
                Point point = firePosition.poll();
                fireQueueSize--;
                for (int i = 0; i < directionX.length; i++) {
                    int nextX = point.x + directionX[i];
                    int nextY = point.y + directionY[i];
                            if (nextX >=0 && nextX < N && nextY >=0 && nextY < M){
                                if (Map[nextX][nextY]!=-1){
                                    Map[nextX][nextY] = -1;
                                    firePosition.add(new Point(nextX,nextY));
                        }
                    }
                }
            }

            while (userQueueSize!=0){
                Point point = userPosition.poll();
                userQueueSize--;
                for (int i = 0; i < directionX.length; i++) {
                    int nextX = point.x + directionX[i];
                    int nextY = point.y + directionY[i];
                    if (nextX >=0 && nextX < N && nextY >=0 && nextY < M){
                        if (Map[nextX][nextY]!=-1 && Visited[nextX][nextY] != 1){   //Not wall , Not visited
                            Visited[nextX][nextY] = 1;
                            userPosition.add(new Point(nextX,nextY));
                        }
                    }else{
                        result++;
                        System.out.println(result);
                        return;
                    }
                }
            }
            result++;
        }
        if (userPosition.isEmpty()){
            System.out.println("IMPOSSIBLE");
        }

    }

    private static class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
