package com.rameshify.coding.leetcode;

/**
 * Leet Code #344: Reverse String
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/reverse-string">Reverse String</a>
 */
public class ReverseString {

  public String reverseString(String s) {
    int start = 0;
    char[] arr = s.toCharArray();
    int end = arr.length - 1;
    while (start < end) {
      char t = arr[start];
      arr[start] = arr[end];
      arr[end] = t;
      start++;
      end--;
    }
    return new String(arr);
  }
}
