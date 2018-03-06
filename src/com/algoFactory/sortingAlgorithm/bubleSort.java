package com.algoFactory.sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bubleSort {

    static void bubleSorting(int []arr){
        int dummy;
        int N = arr.length;

        for (int i=N-1;i>0;i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){       //compare & swap between arr[j] and arr[j+1] range 0 ~ i (i = N-1 , N-2 , N-3 ...)
                    dummy = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = dummy;
                }
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

        bubleSorting(arr);

        System.out.println(Arrays.toString(arr));
    }
}
