package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a_1920 {
    static void quickSort(int[] arr, int left, int right) {
        int low = left, high = right, pivot = arr[(left + right) / 2], temp;
        while (low < high) {
            while (arr[low] < pivot && low < high)
                low++;
            while (arr[high] > pivot && low < high)
                high--;

            if (low < high) {
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        if (left < low - 1)
            quickSort(arr, left, low - 1);
        if (high + 1 < right)
            quickSort(arr, high + 1, right);
    }

    public static int bSearch(int[] arr, int val) {
        int left = 0, right = arr.length - 1, middle;

        while (left <= right) {
            middle = (left + right) / 2;
            if (val < arr[middle])
                right = middle - 1;
            else if (val > arr[middle])
                left = middle + 1;
            else //val == arr[middle]
                return middle;
        }
        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer firstToken = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer secondToken = new StringTokenizer(br.readLine());

        int[] firstArr = new int[N];
        for (int i = 0; i < N; i++)
            firstArr[i] = Integer.parseInt(firstToken.nextToken());

        int[] secondArr = new int[M];
        for (int i = 0; i < M; i++)
            secondArr[i] = Integer.parseInt(secondToken.nextToken());


        Arrays.sort(firstArr);
        //quickSort(firstArr, 0, N - 1);
        //quickSort(secondArr, 0, M - 1);

        for (int i=0;i<M;i++) {
            if(bSearch(firstArr,secondArr[i]) == -1)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
