package com.karpovich.leetcode.arrays;

/*
Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            nums[i] = count;
        }

        int tmpCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                tmpCount++;
            }
        }
        return tmpCount;
    }
}
