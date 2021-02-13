package com.karpovich.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SquaresOfASortedArrayTest {

    @Test
    @DisplayName("If input nums = [-4,-1,0,3,10] then output: [0,1,9,16,100]")
    void sortedSquares() {
        //given
        int[] arr = new int[]{-4, -1, 0, 3, 10};
        //when
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] actualResult = squaresOfASortedArray.sortedSquares(arr);
        //then
        Assertions.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, actualResult);
    }
}
