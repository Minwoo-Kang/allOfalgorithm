package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a_2667 {
    private static int[][] direction = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int map[][] = new int[N][N];
        List<Integer> groupNumberList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String string = new String(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = string.charAt(j) - '0';
            }
        }

        Queue<Group> queue = new LinkedList<>();
        int groupNumber = 0;
        int numberOfMember;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    groupNumber++;
                    map[i][j] = 0;
                    numberOfMember = 1;
                    queue.add(new Group(i, j, groupNumber, numberOfMember));

                    while (!queue.isEmpty()) {
                        Group group = queue.poll();
                        for (int k = 0; k < direction.length; k++) {
                            if (group.x + direction[k][0] < N && group.x + direction[k][0] >= 0
                                    && group.y + direction[k][1] < N && group.y + direction[k][1] >= 0) {
                                if (map[group.x + direction[k][0]][group.y + direction[k][1]] == 1) {
                                    map[group.x + direction[k][0]][group.y + direction[k][1]] = 0;  //check visited
                                    queue.add(new Group(group.x + direction[k][0], group.y + direction[k][1], group.groupNumber, numberOfMember++));
                                }
                            }
                        }
                    }

                    groupNumberList.add(numberOfMember);
                }
            }
        }
        Collections.sort(groupNumberList);
        System.out.println(groupNumberList.size());
        for (Integer integer : groupNumberList)
            System.out.println(integer);

    }

    static class Group {
        int x;
        int y;
        int groupNumber;
        int numberOfMember;

        public Group(int x, int y, int groupNumber, int numberOfMember) {
            this.x = x;
            this.y = y;
            this.groupNumber = groupNumber;
            this.numberOfMember = numberOfMember;
        }
    }
}
