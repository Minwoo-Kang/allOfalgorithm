package com.algoFactory.baekjoonAlgo;

import java.io.*;

public class a_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int countOfBasket[] = new int[N+1];
        countOfBasket[3] = 1;
        if(N>=5)
            countOfBasket[5] = 1;

        for (int i = 6; i < N+1; i++) {
            if(countOfBasket[i-3] !=0 && countOfBasket[i-5] !=0)
                countOfBasket[i] = Math.min(countOfBasket[i-3],countOfBasket[i-5]) + 1;
            else if (countOfBasket[i-3] !=0)
                countOfBasket[i] = countOfBasket[i-3] + 1;
            else if (countOfBasket[i-5] !=0)
                countOfBasket[i] = countOfBasket[i-5] + 1;
            else
                continue;
        }
        if (countOfBasket[N] !=0)
            System.out.println(countOfBasket[N]);
        else
            System.out.println(-1);
    }
}
