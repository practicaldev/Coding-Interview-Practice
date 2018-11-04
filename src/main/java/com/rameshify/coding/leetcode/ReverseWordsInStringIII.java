package com.rameshify.coding.leetcode;

/**
 * Leet Code #557: Reverse Words in a String III
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii">Reverse Words in a String III</a>
 */
public class ReverseWordsInStringIII {

  public String reverseWords(String s) {
    char[] arr = s.toCharArray();
    int start = 0;
    int length = arr.length;
    // reverse all words
    for (int i = 0; i < length; i++) {
      if (arr[i] == ' ') {
        reverse(arr, start, i - 1);
        start = i + 1;
      } else if (i == length-1) {
        reverse(arr, start, i);
      }
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
