package com.ntcode.twopointer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = validPalindrome.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    void isPalindromeV2() {
        String s = "race a car";
        boolean result = validPalindrome.isPalindromeV2(s);
        assertFalse(result);
    }
}