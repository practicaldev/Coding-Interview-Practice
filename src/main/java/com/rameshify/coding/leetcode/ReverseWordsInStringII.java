package com.rameshify.coding.leetcode;

/**
 * Leet Code #186: Reverse Words in a String II
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-ii">Reverse Words in a String II</a>
 */
public class ReverseWordsInStringII {

  public void reverseWords(char[] arr) {
    int start = 0;
    int length = arr.length;
    int end = length - 1;
    // reverse all words
    for (int i = 0; i < length; i++) {
      if (arr[i] == ' ') {
        reverse(arr, start, i - 1);
        start = i + 1;
      }
    }
    // reverse last word
    reverse(arr, start, end);
    // reverse the words in a string
    reverse(arr, 0, end);
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
