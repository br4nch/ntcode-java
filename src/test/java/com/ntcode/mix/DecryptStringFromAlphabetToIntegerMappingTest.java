package com.ntcode.mix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class DecryptStringFromAlphabetToIntegerMappingTest {

    private final DecryptStringFromAlphabetToIntegerMapping main = new DecryptStringFromAlphabetToIntegerMapping();

    @Test
    void freqAlphabets() {
        String s = "10#11#12";
        String expected = "jkab";

        String res = main.freqAlphabets(s);
        assertEquals(expected, res);
    }
}