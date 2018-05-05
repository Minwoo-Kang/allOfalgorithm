package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a_1697 {
    static boolean visited[] = new boolean[100001];
    static int[] dx = {-1,1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //short circuit
        if(K < N) {
            System.out.println(N - K);
            return;
        }
        System.out.println(bfs(N,K));
    }

    private static int bfs(int n,int k) {
        Queue<Node> queue = new LinkedList<>();

        visited[n] = true;
        queue.add(new Node(n,0));

        while (!queue.isEmpty()){
            Node node = queue.poll();
            int pos = node.pos;
            int cnt = node.cnt;

            if (pos == k){
                return cnt;
            }

            for (int i = 0; i < dx.length; i++) {
                int next;
                if (dx[i]!=0)
                    next = pos + dx[i];
                else
                    next = pos *2;

                if(0<=next && next <= 100000){
                    if (!visited[next]) {
                        queue.add(new Node(next, cnt + 1));
                        visited[next] = true;
                    }
                }
            }
        }
        return 0;
    }

    static class Node{
        int pos,cnt;

        public Node(int pos,int cnt) {
            this.pos = pos;
            this.cnt = cnt;
        }
    }
}
