package com.algoFactory.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {
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
        /*
        Input Example
        5  (Value what you want to find)
        1 3 5 7 8 9 10 15 29 31 55 89 102 ... (array which has to be sorted)
        */
        int N = Integer.parseInt(br.readLine());

        //Input Example : 1 2 3 4 5 6 ...
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        int k = 0;

        //insert typed value into arr
        while (st.hasMoreTokens())
            arr[k++] = Integer.parseInt(st.nextToken());

        System.out.println(bSearch(arr, N));

    }
}
