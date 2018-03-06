package com.algoFactory.sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class insertionSort {
    static void insertionSorting(int []arr){
        int pivot,dummy;
        int N = arr.length;

        for (int i=1;i<N;i++){
            pivot = i;
            dummy = arr[i];
            while (pivot > 0 && dummy < arr[pivot-1]){   //if you shouldn't write a condition which is "pivot > 0" before "arr[pivot-1]" , it will make "ArrayIndexOutOfBoundsException" error.
                arr[pivot] = arr[pivot -1]; //move arr[pivot-1] to arr[pivot]
                pivot--;
            }
            arr[pivot] = dummy;
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

        insertionSorting(arr);

        System.out.println(Arrays.toString(arr));
    }
}
