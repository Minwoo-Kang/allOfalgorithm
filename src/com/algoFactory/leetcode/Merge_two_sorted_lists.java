package com.algoFactory.leetcode;

/**
 * User: Minwoo Kang
 * Date: 2020/11/06
 * Time: 12:36 AM
 */

public class Merge_two_sorted_lists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode head = result;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                //add smaller one
                result.next = new ListNode(l2.val);
                result = result.next;
                l2 = l2.next;
            } else {
                //add smaller one
                result.next = new ListNode(l1.val);
                result = result.next;
                l1 = l1.next;
            }
        }

        while (l1 != null) {
            result.next = new ListNode(l1.val);
            result = result.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            result.next = new ListNode(l2.val);
            result = result.next;
            l2 = l2.next;
        }

        return head.next;
    }
}
