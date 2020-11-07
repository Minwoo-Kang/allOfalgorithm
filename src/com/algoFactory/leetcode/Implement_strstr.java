package com.algoFactory.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Minwoo Kang
 * Date: 2020/11/08
 * Time: 1:56 AM
 */

public class Implement_strstr {

    public static void main(String[] args) {
        String stack = "abc";
        String needle = "c";

        int i = strStr(stack, needle);

    }

    public static int strStr(String haystack, String needle) {
        int N = needle.length();
        int M = haystack.length();

        if (N == 0)
            return 0;

        //short circuit - 만약에 찾으려는 단어(needle)의 길이가 주어진 보기(haystack)보다 크다면, 결과는 무조건 -1
        if (N > M)
            return -1;

        Map<String, Integer> map = new HashMap<>();

        //initial buffer
        StringBuffer sb = new StringBuffer(haystack.substring(0, N));
        map.put(sb.toString(), 0);

        for (int i = 1; i + N - 1< M; i++) {
            sb.deleteCharAt(0);
            sb.append(haystack.charAt(i + N - 1));

            if (!map.containsKey(sb.toString()))
                map.put(sb.toString(), i);
        }

        if (!map.containsKey(needle))
            return -1;
        else
            return map.get(needle);
    }
}
