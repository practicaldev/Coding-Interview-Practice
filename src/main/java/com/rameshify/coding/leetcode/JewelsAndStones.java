package com.rameshify.coding.leetcode;

/**
 * Leet Code #771: Jewels and Stones
 *
 * @author Ramesh Sakibanda
 * @see <a href="https://leetcode.com/problems/jewels-and-stones">Jewels and Stones</a>
 */
public class JewelsAndStones {

  public int numJewelsInStones(String J, String S) {
    int[] stonesCount = new int[128];
    int jewelCount = 0;
    // stonesCount stonesCount.
    for (char stone : S.toCharArray()) {
      stonesCount[stone]++;
    }
    /* stonesCount jewels. */
    for (char jewel : J.toCharArray()) {
      jewelCount += stonesCount[jewel];
    }
    return jewelCount;
  }

  public static void main(String[] args) {
    JewelsAndStones jewelsAndStones = new JewelsAndStones();
    System.out.println(jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
  }
}
