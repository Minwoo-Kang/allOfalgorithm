package com.algoFactory.leetcode;

/**
 * User: Minwoo Kang
 * Date: 2020/11/13
 * Time: 12:52 AM
 */

public class Add_binary {

    public static void main(String[] args) {
        System.out.println('0');
        String a = "1110110101";
        String b = "1110111011";

        String s = addBinary(a, b);
        System.out.println(s);

    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        while(i>=0 || j>=0){
            int sum = 0;
            if(i >= 0){
                sum += a.charAt(i) - '0';// -'0' to convert a char to int
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sum += carry;
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry > 0)
            sb.append(carry);
        return sb.reverse().toString();

    }

}
