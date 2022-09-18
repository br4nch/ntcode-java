package com.ntcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class RemoveDuplicatesTest {

    private final RemoveDuplicates main = new RemoveDuplicates();

    @Test
    void removeDuplicates() {
        int[] arr = new int[]{1, 1, 2};
        int res = main.removeDuplicates(arr);
        assertEquals(2, res);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
    }
}