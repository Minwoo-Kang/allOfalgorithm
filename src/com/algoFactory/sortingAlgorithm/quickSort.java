package com.algoFactory.sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class quickSort {
    static void quickSorting(int[] arr, int left, int right) {
        int low = left;
        int high = right;
        int pivot = arr[(right + left) / 2];
        int dummy;

        while (high > low) {    //repeat this steps until high < low
            while (arr[low] < pivot && low < high)  //increasing low variable until met arr[low] > arr[pivot]
                low++;

            while (arr[high] > pivot && low < high)    //decreasing high variable until met arr[high] < arr[pivot]
                high--;

            if (high > low) {
                //swap arr[low] <=> arr[high]
                dummy = arr[low];
                arr[low] = arr[high];
                arr[high] = dummy;
            }
        }
        //when 'while' loop is end , 'low' and 'high' will be same

        if(left<low-1)
            quickSorting(arr, left, low - 1);
        if(high+1 < right)
            quickSorting(arr, high + 1, right);
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

        quickSorting(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
