package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a_1197 {
    static int[] parent;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        Node[] nodeList = new Node[M];
        int weightOfCost=0;

        for (int i = 1; i <=N ; i++)
            parent[i]=i;

        for (int i = 0; i <M ; i++) {
            st = new StringTokenizer(br.readLine());
            nodeList[i] = new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        //Arrays.sort(nodeList,Comparator.comparing(Node::getCost));
        Arrays.sort(nodeList, Comparator.comparingInt(Node -> Node.cost));

        for (int i = 0; i <M;i++){
            int rootX = findRoot(nodeList[i].start);
            int rootY = findRoot(nodeList[i].end);

            if (rootX == rootY) //시작점과 출발점의 root노드가 같다는 것은 연결되어 있다는것
                continue;
            else{   //union-find 중 union 함수 , 연결되지 않은 그룹을 연결시켜준다.
                parent[rootX] = rootY;
                weightOfCost += nodeList[i].cost;   //새로 연결된 간선의 가중치를 더해준다.
            }
        }
        System.out.println(weightOfCost);
    }

    //union-find 중 find 함수 , u 노드의 root node 찾기
    private static int findRoot(int u) {
        if (u ==parent[u])  //u node의 값(==parent[u])이 u 랑 같다면 u는 root node
            return u;
        else {
            parent[u] = findRoot(parent[u]);    //u의 parent node를 찾기 위해 parameter로 parent[u]를 넘겨줌
            return parent[u];
        }
    }

    private static class Node{
        int start;
        int end;
        int cost;

        private Node(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
    }
}
