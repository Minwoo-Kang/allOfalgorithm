package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_2644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int countOfRelation = Integer.parseInt(br.readLine());
        int relation[][] = new int[N+1][N+1];
        boolean find = false;

        for (int i = 0; i < countOfRelation; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            relation[x][y]=relation[y][x]=1;
        }

        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < N+1; i++) {
            if (relation[start][i]!=0) {
                relation[start][i]=0;
                queue.add(new Node(i, 1));
            }
            }

            while (!queue.isEmpty()){
                Node node = queue.poll();
                if (node.goal==end) {
                    System.out.println(node.level);
                    find = true;
                    return;
            }

            for (int i = 0; i < N+1; i++) {
                if (relation[node.goal][i]!=0) {
                    relation[node.goal][i]=0;
                    queue.add(new Node(i, node.level + 1));
                }
            }
        }

        if (!find)
            System.out.println(-1);
    }

    static class Node{
        int goal,level;

        public Node(int goal, int level) {
            this.goal = goal;
            this.level = level;
        }
    }
}
