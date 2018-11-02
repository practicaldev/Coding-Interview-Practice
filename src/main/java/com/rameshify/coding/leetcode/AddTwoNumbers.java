package com.rameshify.coding.leetcode;

/**
 * Leet Code #2: Add Two Numbers
 *
 * @author Ramesh Sakibanda
 * @link leetcode.com/problems/two-sum
 * @see <a href="https://leetcode.com/problems/add-two-numbers">Add Two Numbers</a>
 */
public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode answer = new ListNode(0);
    while (l1 != null || l2 != null || carry > 0) {
      ListNode current = answer;
      while (current.next != null)
        current = current.next;
      int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
      carry = sum / 10;
      current.next = new ListNode(sum % 10);
      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }
    return answer.next;
  }

  //  Definition for singly-linked list.
  private static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}

