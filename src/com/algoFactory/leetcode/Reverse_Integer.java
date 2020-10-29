package com.algoFactory.leetcode;


/**
 * User: Minwoo Kang
 * Date: 2020/10/30
 * Time: 12:26 AM
 */

public class Reverse_Integer {

    public static void main(String[] args) {
        int input = 321;
        int output = reverse(input);

        assert output == 123;
    }

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;

            int mightOverflow = (int)result;

            if (result != mightOverflow) {
                return 0;
            }
        }

        return (int) result;
    }
}
