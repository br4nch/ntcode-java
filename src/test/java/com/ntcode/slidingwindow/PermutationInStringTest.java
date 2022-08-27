package com.ntcode.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class PermutationInStringTest {

    private final PermutationInString main = new PermutationInString();

    @Test
    void checkInclusion() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean res = main.checkInclusion(s1, s2);
        assertTrue(res);
    }
}