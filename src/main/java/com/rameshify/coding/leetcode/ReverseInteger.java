package com.rameshify.coding.leetcode;

/**
 * Leet Code #7: Reverse Integer
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/reverse-integer">Reverse Integer</a>
 */
public class ReverseInteger {
  public int reverse(int x) {
    int rev = 0;
    int prev_num = 0;
    boolean negative = false;
    if (x < 0) {
      negative = true;
      x *= -1;
    }
    while (x > 0) {
      int rem = x % 10;
      rev = rev * 10 + rem;
      x /= 10;
      if ((rev - rem) / 10 != prev_num) {
        return 0;
      }
      prev_num = rev;
    }
    return negative ? rev * -1 : rev;
  }

  public static void main(String[] args) {
    ReverseInteger reverseInteger = new ReverseInteger();
    System.out.println(reverseInteger.reverse(123));
    System.out.println(reverseInteger.reverse(-123));
    System.out.println(reverseInteger.reverse(Integer.MAX_VALUE));//
    System.out.println(reverseInteger.reverse(Integer.MIN_VALUE));//0
  }
}
