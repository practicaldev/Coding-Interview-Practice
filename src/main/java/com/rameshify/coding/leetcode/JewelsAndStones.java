package com.rameshify.coding.leetcode;

/**
 * Leet Code #771: Jewels and Stones
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/jewels-and-stones">Jewels and Stones</a>
 */
public class JewelsAndStones {

  public int numJewelsInStones(String J, String S) {
    int[] jewels = new int[128];
    int count = 0;
    // count all stones.
    for (char a : S.toCharArray()) {
      jewels[a]++;
    }
    // add jewels count.
    for (char a : J.toCharArray()) {
      count += jewels[a];
    }
    return count;
  }

  public static void main(String[] args) {
    JewelsAndStones jewelsAndStones = new JewelsAndStones();
    System.out.println(jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
  }
}
