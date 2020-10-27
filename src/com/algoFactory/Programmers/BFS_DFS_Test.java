package com.algoFactory.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_DFS_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        int[][] map = new int[N+1][N+1];
        int[] visited = new int[N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());

            map[first][last] = map[last][first] = 1;
        }

        dfs(map,visited,start);
        Arrays.fill(visited,0);
        System.out.println();
        bfs(map,visited,start);
    }

    private static void dfs(int [][]map, int []visited, int start){
        visited[start] = 1;
        System.out.print(start+" ");
        for (int next = 1; next < map.length; next++) {
            if (map[start][next] == 1 && visited[next] != 1) dfs(map,visited,next);
        }
    }

    private static void bfs(int [][]map, int []visited, int start){
        Queue<Integer> integerQueue = new LinkedList<>();
        visited[start] = 1;
        integerQueue.add(start);


        while (!integerQueue.isEmpty()){
            Integer current = integerQueue.poll();
            System.out.print(current+ " ");
            for (int next = 1; next < map.length; next++) {
                if (map[current][next] == 1 && visited[next] != 1){
                    integerQueue.add(next);
                    visited[next] = 1;
                }
            }
        }
    }
}
