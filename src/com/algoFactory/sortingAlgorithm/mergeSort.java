package com.algoFactory.sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class mergeSort {
    static void mergeSorting(int []arr, int left, int right){
        int leftSide = left , rightSide = ((left + right) / 2) + 1, k , middle = (left + right) / 2;

        if (left <right){
            mergeSorting(arr,left,middle);
            mergeSorting(arr,middle+1,right);

            int temp[] = Arrays.copyOf(arr,arr.length);

            for (k = left;k <= right; k++){
                if (leftSide > middle)  //if left group has nothing , then put all values in right group to arr
                    arr[k] = temp[rightSide++];
                else if (rightSide > right) //if right group has nothing , then put all values in left group to arr
                    arr[k] = temp[leftSide++];
                else
                    arr[k] = (temp[leftSide] < temp[rightSide]) ? temp[leftSide++] : temp[rightSide++];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        Input Example
        5  (Number of value)
        1 5 2 50 2 3 12 52 ... (values you want to sort)
        */
        //Input Example : 5 (N is a number of values)
        int N = Integer.parseInt(br.readLine());

        //Input Example : 1 2 3 4 5 6 ...
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int k = 0;

        //insert typed value into arr
        while (st.hasMoreTokens())
            arr[k++] = Integer.parseInt(st.nextToken());

        mergeSorting(arr,0,N-1);

        System.out.println(Arrays.toString(arr));
    }
}
