package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class a_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int root[] = new int[N + 1];
        root[1] = 1;

        StringTokenizer st;
        Stack<int[]> stack = new Stack<>();
        Stack<int[]> stack2 = new Stack<>();
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (root[a] == 0 && root[b] == 0) {
                int[] arr = {a, b};
                stack.push(arr);
            } else if (root[a] != 0)
                root[b] = a;
            else    //root[b] !=0
                root[a] = b;
        }

        while (!stack.isEmpty() || !stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                int[] arr = stack.pop();
                int a = arr[0];
                int b = arr[1];

                if (root[a] == 0 && root[b] == 0) {
                    arr[0] = a;
                    arr[1] = b;
                    stack2.push(arr);
                } else if (root[a] != 0)
                    root[b] = a;
                else    //root[b] !=0
                    root[a] = b;
            }
            while (!stack2.isEmpty()) {
                int[] arr = stack2.pop();
                int a = arr[0];
                int b = arr[1];

                if (root[a] == 0 && root[b] == 0) {
                    arr[0] = a;
                    arr[1] = b;
                    stack.push(arr);
                } else if (root[a] != 0)
                    root[b] = a;
                else    //root[b] !=0
                    root[a] = b;
            }
        }
        for (int i = 2; i <= N; i++)
        {
            System.out.println(root[i]);
        }
    }
}
