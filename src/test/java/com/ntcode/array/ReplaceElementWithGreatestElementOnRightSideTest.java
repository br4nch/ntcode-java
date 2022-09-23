package com.ntcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class ReplaceElementWithGreatestElementOnRightSideTest {

    private final ReplaceElementWithGreatestElementOnRightSide main = new ReplaceElementWithGreatestElementOnRightSide();

    @Test
    void replaceElements() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] expected = new int[]{18, 6, 6, 6, 1, -1};
        int[] res = main.replaceElements(arr);
        assertTrue(res.length > 0);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], res[i]);
        }
    }
}