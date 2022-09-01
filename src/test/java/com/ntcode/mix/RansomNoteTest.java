package com.ntcode.mix;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RansomNoteTest {

    private final RansomNote main = new RansomNote();

    @Test
    void canConstruct() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean actual = main.canConstruct(ransomNote, magazine);
        assertTrue(actual);
    }
}