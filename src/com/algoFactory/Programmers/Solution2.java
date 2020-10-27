package com.algoFactory.Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/43162

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] checked = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (computers[i][j] == 1 && checked[j] == false){
                    answer++;
                    Queue<Integer> integerQueue = new LinkedList<>();
                    integerQueue.add(j);
                    checked[j] = true;
                    while (!integerQueue.isEmpty()){
                        int newInt = integerQueue.poll();
                        for (int k = 0; k < n; k++) {
                            if (computers[newInt][k] == 1 && checked[k] == false){
                                integerQueue.add(k);
                                checked[k] = true;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}
