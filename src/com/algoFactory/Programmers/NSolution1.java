package com.algoFactory.Programmers;

public class NSolution1 {

    private boolean isLeaf;

    public static int[] solution(int[]cook_times, int [][]order, int k){
        int[] answer = {};

        Node[] weightCookTimes = new Node[cook_times.length];
        boolean[][] connected = new boolean[cook_times.length][cook_times.length];
        boolean[] visited = new boolean[cook_times.length];
        for (int i = 0; i < cook_times.length; i++) {
            weightCookTimes[i] = new Node(0,0);
        }
        for (int i = 0; i < order.length; i++) {
            int source = order[i][0];
            int target = order[i][1];
            connected[target-1][source-1]= true;
        }

        for (int i = 0; i < cook_times.length; i++) {
            boolean isLeaf = isLeaf;
            for (int j = 0; j < cook_times.length; j++) {
                if (connected[i][j] == true)
                    isLeaf = false;
            }
            if(isLeaf)
                weightCookTimes[i] = new Node(cook_times[i],0);
        }
        Node result = getCookTimeByDFS(k-1,connected,cook_times,weightCookTimes,visited);
        System.out.println(result.weightTime);
        System.out.println(result.depth);
        answer = new int[2];
        answer[0] = result.depth;
        answer[1] = result.weightTime;
        return answer;
    }

    public static Node getCookTimeByDFS(int start, boolean[][] connected, int[] cook_times, Node[] weightCookTimes,boolean[] visited){
        if (weightCookTimes[start].weightTime != 0)  //isLeafNode
            return weightCookTimes[start];

        int maxCookTime = 0;
        int maxDepth = 0;
        int prevDepth = 0;
        for (int i = 0; i < cook_times.length; i++) {
            if (connected[start][i] == true){//연결된 자식 노드가 있으면,
                if (visited[i]==false) {
                    prevDepth++;
                    visited[i] = true;
                }
                Node nextNode = getCookTimeByDFS(i,connected,cook_times,weightCookTimes,visited);
                maxCookTime = Math.max(maxCookTime,nextNode.weightTime);
                maxDepth = Math.max(maxDepth,nextNode.depth);
                //자식 들중 가장 가중치가 높은 값을 저장
            }
        }
        weightCookTimes[start].weightTime = cook_times[start] + maxCookTime;
        weightCookTimes[start].depth = prevDepth+maxDepth;
        return weightCookTimes[start];
    }

    public static class Node{
        int weightTime;
        int depth;

        public Node(int weightTime, int depth) {
            this.weightTime = weightTime;
            this.depth = depth;
        }
    }

    public static void main(String[] args) {
        int[] ckt = {5,3,2};
        int[][] order = {{1,2},{2,3},{1,3}};
        int k = 3;
        solution(ckt,order,k);
    }
}
