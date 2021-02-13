package com.karpovich.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    @DisplayName("Input: nums = [12,345,2,6,7896] Output: 2")
    void findNumbers() {
        //given
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        //when //then
        Assertions.assertEquals(2, new FindNumbersWithEvenNumberOfDigits().findNumbers(nums));
    }
}
