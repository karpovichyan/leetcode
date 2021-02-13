package com.karpovich.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

    @Test
    @DisplayName("If input: [1,1,0,1,1,1] then Output: 3")
    void test1() {
        //given
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        //when
        MaxConsecutiveOnes test = new MaxConsecutiveOnes();
        int actualResult = test.findMaxConsecutiveOnes(arr);
        //then
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    @DisplayName("If input: [1, 0, 1, 1, 0, 1] then Output: 2")
    void test2() {
        //given
        int[] arr = new int[]{1, 0, 1, 1, 0, 1};
        //when
        MaxConsecutiveOnes test = new MaxConsecutiveOnes();
        int actualResult = test.findMaxConsecutiveOnes(arr);
        //then
        Assertions.assertEquals(2, actualResult);
    }
}
