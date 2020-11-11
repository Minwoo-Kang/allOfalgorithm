package com.algoFactory.leetcode;

/**
 * User: Minwoo Kang
 * Date: 2020/11/12
 * Time: 1:36 AM
 */

public class Search_insert_position {

    // B-search는 종료 시, R < target < L 으로 종료된다.

    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3}, 2);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;

        while (R >= L) {
            int mid = (L + R) / 2;
            if (nums[mid] > target)
                R = mid - 1;
            else if (nums[mid] < target)
                L = mid + 1;
            else if (nums[mid] == target)
                return mid;
        }

        return R + 1;
    }


}
