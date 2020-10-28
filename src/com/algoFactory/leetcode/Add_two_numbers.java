package com.algoFactory.leetcode;

/**
 * User: Minwoo Kang
 * Date: 2020/10/28
 * Time: 9:11 PM
 */

public class Add_two_numbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode startPos = result;

        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;

            result.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }

        // add rest of node in l1
        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            result.next = new ListNode(sum % 10);

            l1 = l1.next;
            result = result.next;
        }

        // add rest of node in l2
        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            result.next = new ListNode(sum % 10);

            l2 = l2.next;
            result = result.next;
        }

        // add last carry if existed
        if (carry != 0) {
            result.next = new ListNode(carry);
        }

        return startPos.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode currentPosL1 = l1;
        currentPosL1.next = new ListNode(9);
        currentPosL1 = currentPosL1.next;
        currentPosL1.next = new ListNode(9);
        currentPosL1 = currentPosL1.next;
        currentPosL1.next = new ListNode(9);
        currentPosL1 = currentPosL1.next;
        currentPosL1.next = new ListNode(9);
        currentPosL1 = currentPosL1.next;
        currentPosL1.next = new ListNode(9);
        currentPosL1 = currentPosL1.next;
        currentPosL1.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        ListNode currentPosL2 = l2;
        currentPosL2.next = new ListNode(9);
        currentPosL2 = currentPosL2.next;
        currentPosL2.next = new ListNode(9);
        currentPosL2 = currentPosL2.next;
        currentPosL2.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1, l2);
        assert result.val == 8;
        result = result.next;
        assert result.val == 9;
        result = result.next;
        assert result.val == 9;
        result = result.next;
        assert result.val == 9;
        result = result.next;
        assert result.val == 0;
        result = result.next;
        assert result.val == 0;
        result = result.next;
        assert result.val == 0;
        result = result.next;
        assert result.val == 1;

    }
}
