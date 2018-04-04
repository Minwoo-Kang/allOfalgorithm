package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class a_1922 {
    static int parent[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        parent = new int[N + 1];
        int cnt=0,cost=0;
        int[][] nodeList = new int[M][3];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            nodeList[i][0] = Integer.parseInt(st.nextToken());
            nodeList[i][1] = Integer.parseInt(st.nextToken());
            nodeList[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++)
            parent[i] = i;

        Arrays.sort(nodeList, Comparator.comparing(node -> node[2]));
        for (int i = 0; i < M; i++) {
            int rootX = findRoot(nodeList[i][0]);
            int rootY = findRoot(nodeList[i][1]);

            if (rootX != rootY) {   //not connected between nodeList[i][0] <-> nodeList between[i][1]
                cnt++;
                parent[rootX] = rootY;
                cost += nodeList[i][2];
                if (cnt==M-1)
                    break;
            }
        }

        System.out.println(cost);

    }

    private static int findRoot(int u) {
        if (parent[u] == u)
            return u;
        else {
            parent[u] = findRoot(parent[u]);
            return parent[u];
        }
    }


}