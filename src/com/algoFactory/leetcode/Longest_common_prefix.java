package com.algoFactory.leetcode;

/**
 * User: Minwoo Kang
 * Date: 2020/11/03
 * Time: 7:17 PM
 */

public class Longest_common_prefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            //prefix 비교를 위한 ch는 무조건 첫번째껄로 지정,
            for (int k = 1; k < strs.length; k++) {
                if (i > strs[k].length())
                    return sb.toString();

                if (ch != strs[k].charAt(i))
                    return sb.toString();
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
