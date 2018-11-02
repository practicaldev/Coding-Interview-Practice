package com.rameshify.coding.leetcode;

/**
 * Leet Code #1: Two Sum
 * @see <a href="https://leetcode.com/problems/two-sum">Two Sum</a>
 * @link leetcode.com/problems/two-sum
 * @author Ramesh Sakibanda
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int n = 2048;
    int bitMode = n - 1;
    int table[] = new int[n];
    int first = nums[0];
    for (int index = 1; index < nums.length; index++) {
      int difference = target - nums[index];
      if (difference == first) {
        return new int[]{0, index};
      }
      int found = table[difference & bitMode];
      if(found != 0){
        return new int[]{found, index};
      }
      table[nums[index] & bitMode] = index;
    }
    return new int[0];
  }
}
