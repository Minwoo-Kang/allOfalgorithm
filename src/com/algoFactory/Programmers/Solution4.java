package com.algoFactory.Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/43163

public class Solution4 {
    public static boolean canTranslate(String begin, String target){
        int unMacthedCnt = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) != target.charAt(i))
                unMacthedCnt++;
        }
        return unMacthedCnt == 1 ? true : false;
    }
}
