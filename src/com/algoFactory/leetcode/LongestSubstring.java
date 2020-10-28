package com.algoFactory.leetcode;

/**
 * User: Minwoo Kang
 * Date: 2020/10/29
 * Time: 12:38 AM
 */

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int[] including = new int[256];
        // if including['a'] != 1, 'a' is in current substring window
        // if including['a'] ==0, 'a' is not in current substring window
        int max = 0;
        int left = 0;
        int right = 0;
        int length = s.length();

        if (s.length() == 1)
            return 1;

        while (left < length) {
            if (including[s.charAt(right)] == 0) {
                including[s.charAt(right)]++;
                right++;
                max = Math.max(max, right - left);
                if (right == length) {
                    break;
                }
            } else {
                including[s.charAt(left)]--;
                left++;
            }
        }


        return max;
    }
}
