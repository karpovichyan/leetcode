package com.karpovich.leetcode.arrays;

/*
Given a binary array, find the maximum number of consecutive 1s in this array
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxOfOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (maxOfOnes < count) {
                    maxOfOnes = count;
                }
            } else {
                count = 0;
            }
        }
        return maxOfOnes;
    }
}
