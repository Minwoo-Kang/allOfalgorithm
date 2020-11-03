package com.algoFactory.leetcode;

/**
 * User: Minwoo Kang
 * Date: 2020/11/03
 * Time: 1:40 PM
 */

public class Palindrome_Number {

    public boolean isPalindrome(int x) {
        //short circuit
        if (x<0)
            return false;

        //1. Convert int to string
        final String strNum = String.valueOf(x);
        int len = strNum.length();

        //2. for-loop : 문자열의 길이의 2/n만큼 순회하며, 0 : n-1 , 1 : n-2 , 2 : n-3 ... 이 일치하는지 확인
        //[문자열 길이가 홀수 인경우, 중간 값은 검사하지 않아도됨]
        for (int i = 0; i < len / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(len - 1 - i)) return false;
        }

        return true;
    }
}
