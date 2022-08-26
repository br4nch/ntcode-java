package com.ntcode.twopointer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class TwoSumIITest {

    private final TwoSumII twoSumII = new TwoSumII();

    @Test
    void execute() {
        int[] arr1 = new int[]{-1000, -1, 0, 1};
        int t1 = 1;
        int[] arr2 = new int[]{2, 3, 4};
        int t2 = 6;
        int[] arr3 = new int[]{-1, 0};
        int t3 = -1;


        int[] res1 = twoSumII.execute(arr1, t1);
        int[] expected1 = new int[]{3, 4};
        for (int i = 0; i < expected1.length; i++) {
            assertEquals(expected1[i], res1[i]);
        }

        int[] res2 = twoSumII.execute(arr2, t2);
        int[] expected2 = new int[]{1, 3};
        for (int i = 0; i < expected2.length; i++) {
            assertEquals(expected2[i], res2[i]);
        }

        int[] res3 = twoSumII.execute(arr3, t3);
        int[] expected3 = new int[]{1, 2};
        for (int i = 0; i < expected3.length; i++) {
            assertEquals(expected3[i], res3[i]);
        }
    }
}