package com.ntcode.array;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        int[] ex1 = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.execute(ex1, target);
        System.out.println(Arrays.toString(twoSum.execute(ex1, target)));
        int[] expected = new int[]{0, 1};

        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}