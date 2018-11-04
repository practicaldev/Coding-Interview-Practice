package com.rameshify.coding.leetcode;

/**
 * Leet Code #7: Reverse Integer
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/reverse-integer">Reverse Integer</a>
 */
public class ReverseInteger {
  public int reverse(int x) {
    int reversed = 0;
    int t;
    int tenthOfMax = Integer.MAX_VALUE / 10;
    int tenthOfMin = Integer.MIN_VALUE / 10;
    while (x != 0) {
      int leftOver = x % 10;
      /* determine if the number is on the verge of overflowing */
      if (reversed > tenthOfMax || reversed == tenthOfMax && leftOver > 7) {
        return 0;
      }else if (reversed < tenthOfMin || reversed == tenthOfMin && leftOver < -8) {
        return 0;
      }
      reversed = reversed * 10 + leftOver;
      x /= 10;
    }
    return reversed;
  }

  public static void main(String[] args) {
    ReverseInteger reverseInteger = new ReverseInteger();
    System.out.println(reverseInteger.reverse(123));
    System.out.println(reverseInteger.reverse(-123));
    System.out.println(reverseInteger.reverse(Integer.MAX_VALUE));//
    System.out.println(reverseInteger.reverse(Integer.MIN_VALUE));//0
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }
}
