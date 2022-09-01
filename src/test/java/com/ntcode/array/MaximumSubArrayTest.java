package com.ntcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class MaximumSubArrayTest {

    private final MaximumSubArray main = new MaximumSubArray();

    @Test
    void maxSubArray() {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        int res = main.maxSubArray(arr);
        assertEquals(expected, res);
    }
}