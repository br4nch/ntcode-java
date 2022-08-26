package com.ntcode.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class LongestRepeatingCharacterReplacementTest {

    private final LongestRepeatingCharacterReplacement main = new LongestRepeatingCharacterReplacement();

    @Test
    void execute() {
        String s = "ABAB";
        int k = 2;
        int expected = 4;
        int res = main.execute(s, k);
        assertEquals(expected, res);
    }
}