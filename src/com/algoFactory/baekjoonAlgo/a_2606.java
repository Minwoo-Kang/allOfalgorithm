package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_2606 {
    private static int[][] Map;
    private static int[] visitNode;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int testCase = Integer.parseInt(br.readLine());
        int result = 0;
        Map = new int[N+1][N+1];
        visitNode = new int[N+1];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Map[x][y] = Map[y][x] =1;
        }

        for (int i = 2; i <= N; i++) {
            if (visitNode[i] == 0 && Map[1][i] == 1) {
                visitNode[i] = 1;
                queue.add(i);
                result++;
            }
        }

        while (!queue.isEmpty()){
            int integer = queue.poll();
            for (int i = 2; i <= N; i++) {
                if (visitNode[i] == 0 && Map[integer][i] == 1) {
                    visitNode[i] = 1;
                    queue.add(i);
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
