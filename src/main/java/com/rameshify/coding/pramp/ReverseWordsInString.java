package com.rameshify.coding.pramp;

public class ReverseWordsInString {
  public static char[] reverseWords(char[] arr) {
    int start = 0;
    int length = arr.length;
    int end = length - 1;
    reverse(arr, start, end);
    start = 0;
    for (int i = 0; i < length; i++) {
      if (arr[i] == ' ') {
        reverse(arr, start, i - 1);
        start = i + 1;
      }
    }
    reverse(arr, start, end);
    return arr;
  }

  private static void reverse(char[] arr, int here, int there) {
    while (here < there) {
      swap(arr, here, there);
      here++;
      there--;
    }
  }

  private static void swap(char[] arr, int thisIndex, int thatIndex) {
    char t = arr[thisIndex];
    arr[thisIndex] = arr[thatIndex];
    arr[thatIndex] = t;
  }

  public static void main(String[] args) {
    System.out.println(reverseWords("World! Hello".toCharArray()));
  }
}
