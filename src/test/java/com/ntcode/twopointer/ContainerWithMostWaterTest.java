package com.ntcode.twopointer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater main = new ContainerWithMostWater();

    @Test
    void maxArea() {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int res = main.maxArea(arr);
        assertEquals(expected, res);
    }
}