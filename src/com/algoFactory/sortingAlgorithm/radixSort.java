package com.algoFactory.sortingAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class radixSort {
    static void radixSorting(int []arr){
        LinkedList<Integer>[] counter = new LinkedList[] {
                new LinkedList<Integer>(), new LinkedList<Integer>(),
                new LinkedList<Integer>(), new LinkedList<Integer>(),
                new LinkedList<Integer>(), new LinkedList<Integer>(),
                new LinkedList<Integer>(), new LinkedList<Integer>(),
                new LinkedList<Integer>(), new LinkedList<Integer>() };
        int N = arr.length;

        int d = 0,max = arr[0];

        for (int num : arr){
            if (max<num)
                max = num;
        }
        while (max!=0){
            d++;
            max/=10;
        }

        for (int i=0;i<d;i++){
            for (int j=0;j<N;j++){
                int bucket = (arr[j] % (int)(Math.pow(10,(i+1)))) / (int)(Math.pow(10,i));
                counter[bucket].add(arr[j]);
            }

            int pos = 0;

            for (int j=0;j<N;j++){
                Integer bucketValue;
                while ((bucketValue = counter[j].poll()) !=null){
                    arr[pos++] = bucketValue;
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

        radixSorting(arr);

        System.out.println(Arrays.toString(arr));
    }
}
