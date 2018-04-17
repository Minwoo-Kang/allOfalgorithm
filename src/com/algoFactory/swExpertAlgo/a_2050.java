package com.algoFactory.swExpertAlgo;

import java.io.*;

public class a_2050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        for (int i = 0; i <sb.length() ; i++) {
            int val = sb.charAt(i) - 'A' +1;
            if (val > 26)
                System.out.print(val -32);
            else
                System.out.print(val);
            System.out.print(" ");
        }
    }
}
