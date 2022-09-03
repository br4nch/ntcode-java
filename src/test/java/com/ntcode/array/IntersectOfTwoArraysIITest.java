package com.ntcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class IntersectOfTwoArraysIITest {

    private final IntersectOfTwoArraysII main = new IntersectOfTwoArraysII();

    @Test
    void intersect() {
        int[] arr1 = new int[]{1, 2, 2, 1};
        int[] arr2 = new int[]{2, 2};
        int[] expected = new int[]{2, 2};
        int[] actual = main.intersect(arr1, arr2);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}