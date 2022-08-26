package com.ntcode.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters main = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void execute() {
        var input = "abcabccbb";
        int expected = 3;
        int res = main.execute(input);

        assertEquals(expected, res);
    }
}