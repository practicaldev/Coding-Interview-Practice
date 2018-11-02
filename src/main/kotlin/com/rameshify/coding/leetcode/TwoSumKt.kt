package com.rameshify.coding.leetcode

class TwoSumKt {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            val diff = target - num;
            if (map.containsKey(diff)) {
                return intArrayOf(map[diff]!!, index)
            }
            map[num] = index
        }
        return IntArray(0)
    }
}
