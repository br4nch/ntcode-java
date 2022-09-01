package com.ntcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class RunningSumOff1DArrayTest {

    private final RunningSumOff1DArray main = new RunningSumOff1DArray();

    @Test
    void runningSum() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};
        int[] res = main.runningSum(nums);
        assertEquals(expected.length, res.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], res[i]);
        }
    }
}