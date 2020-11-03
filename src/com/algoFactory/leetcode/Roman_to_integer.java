package com.algoFactory.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Minwoo Kang
 * Date: 2020/11/03
 * Time: 3:07 PM
 */

public class Roman_to_integer {

    public static void main(String[] args) {
        String s = "IV";
        int result = romanToInt(s);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] c = s.toCharArray();
        int sum = 0;
        int i = 0;

        while (i < c.length - 1) {
            if (map.get(c[i]) < map.get(c[i + 1])) {
                sum += map.get(c[i + 1]) - map.get(c[i]);
                i += 2;
            }else{
                sum += map.get(c[i]);
                i += 1;
            }
        }

        if (i == c.length - 1) {
            sum += map.get(c[i]);
        }

        return sum;
    }

}
