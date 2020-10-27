package com.algoFactory.Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/1829?language=java

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        //code here
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && visited[i][j] != true){
                    numberOfArea++;
                    int []result = bfs(picture,visited,i,j);

                    if (result[1] > maxSizeOfOneArea){
                        maxSizeOfOneArea = result[1];
                    }
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private static int[] bfs(int[][] picture, boolean[][] visited, int x, int y) {
        Queue<Node> nodeQueue = new LinkedList<>();
        int color = picture[x][y];
        int maxSizeofBfs = 0;

        int[] directionX = {-1,0,1,0};
        int[] directionY = {0,-1,0,1};

        visited[x][y] = true;
        maxSizeofBfs++;
        nodeQueue.add(new Node(x,y));
        while (!nodeQueue.isEmpty()){
            Node currentNode = nodeQueue.poll();
            for (int i = 0; i < directionX.length; i++) {
                int nextX = currentNode.x + directionX[i];
                int nextY = currentNode.y + directionY[i];
                if (nextX>=0 && nextX <picture.length && nextY >=0 && nextY < picture[0].length){
                    if (picture[nextX][nextY] == color && visited[nextX][nextY] != true){
                        visited[nextX][nextY] = true;
                        maxSizeofBfs++;
                        nodeQueue.add(new Node(nextX,nextY));
                    }
                }
            }
        }

        int result[] = {color,maxSizeofBfs};
        return result;

    }

    private static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int [][]input = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
        int []answer = solution(6,4,input);
        System.out.println(Arrays.toString(answer));
    }
}
