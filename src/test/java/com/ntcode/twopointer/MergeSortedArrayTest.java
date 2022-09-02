package com.ntcode.twopointer;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class MergeSortedArrayTest {

    private final MergeSortedArray main = new MergeSortedArray();

    @Test
    void merge() {
        int[] A = new int[]{1, 2, 3, 0, 0, 0};
        int n = 3;
        int[] B = new int[]{2, 5, 6};
        int m = 3;
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        assertDoesNotThrow(() -> main.merge(A, n, B, m));
        for (int i = 0; i < A.length; i++) {
            assertEquals(expected[i], A[i]);
        }
    }
}