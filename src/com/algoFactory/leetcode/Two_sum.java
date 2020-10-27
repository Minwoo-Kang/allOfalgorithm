package com.algoFactory.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Minwoo Kang
 * Date: 2020/10/27
 * Time: 11:32 PM
 * Link: https://leetcode.com/problems/two-sum/
 */

public class Two_sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;


        int[] ints = twoSum(nums, target);
        assert ints[0] == 0;
        assert ints[1] == 1;
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int targetMinusNum = target - num;

            if (map.containsKey(targetMinusNum)) {
                //already pesisted
                return new int[]{i, map.get(targetMinusNum)};
            }

            map.put(num, i);
        }

        return new int[2];
    }
}
