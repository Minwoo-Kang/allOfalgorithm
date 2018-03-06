package com.algoFactory.baekjoonAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_1032 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer[] stringBuffers = new StringBuffer[N];
        StringBuffer result;
        for(int i =0;i<N;i++)
            stringBuffers[i] = new StringBuffer(br.readLine());

        result = new StringBuffer();

        for(int i=0;i<stringBuffers[0].length();i++){
            for (int j=0;j<N-1;j++){
                if(stringBuffers[j].charAt(i) != stringBuffers[j+1].charAt(i)){
                    result.append('?');
                    break;
                }
            }
            if(result.length()-1!=i)
                result.append(stringBuffers[0].charAt(i));
        }

        System.out.println(result.toString());
    }
}
