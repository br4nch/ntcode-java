package com.ntcode.twopointer;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class ThreeSumTest {

    private final ThreeSum threeSum = new ThreeSum();

    @Test
    void execute() {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        int[][] expected = new int[][]{{-1, 0, 1}, {-1, -1, 2}};
        List<List<Integer>> res = threeSum.execute(arr);
        assertEquals(expected.length, res.size());
    }
}