package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_1373 {
    private static final String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
    private static final String[] first = {"", "1", "10", "11", "100", "101", "110", "111"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());
        StringBuffer dummy;
        StringBuffer result = new StringBuffer();

        if (sb.length()==1) {     //short circuit (input == 0 -> print 0 , input ==1 -> print 1
            System.out.println(sb.toString());
        } else {
            int firstLength = sb.length() % 3;      //if '11100' , firstLength == 2 , if '111000' , firstLength == 3

            if (firstLength == 0)
                firstLength = 3;

            dummy = new StringBuffer(sb.substring(0, firstLength));

            for (int i = 0; i < first.length; i++) {
                if (first[i].equals(dummy.toString())) {
                    result.append(i);
                    break;
                }
            }

            for (int i = firstLength; i <= sb.length() - 3; i += 3) {
                dummy = new StringBuffer(sb.substring(i, i + 3));
                for (int j = 0; j < binary.length; j++) {
                    if (binary[j].equals(dummy.toString())) {
                        result.append(j);
                        break;
                    }
                }
            }
            System.out.println(result.toString());
        }
    }
}
