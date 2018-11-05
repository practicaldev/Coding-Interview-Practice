package com.rameshify.coding.leetcode;

/**
 * Leet Code #541: Reverse String II
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/reverse-string-ii">Reverse String II</a>
 */
public class ReverseStringII {

  public String reverseStr(String s, int k) {
    char[] arr = s.toCharArray();
    int index = 0;
    int max = arr.length - 1;
    while (index <= max) {
      int stop = index + k - 1;
      int there = (stop <= max) ? stop : max;
      reverse(arr, index, there);
      index += 2 * k;
    }
    return String.valueOf(arr);
  }

  private void reverse(char[] arr, int here, int there) {
    while (here < there) {
      swap(arr, here, there);
      here++;
      there--;
    }
  }

  private void swap(char[] arr, int thisIndex, int thatIndex) {
    char t = arr[thisIndex];
    arr[thisIndex] = arr[thatIndex];
    arr[thatIndex] = t;
  }
}
