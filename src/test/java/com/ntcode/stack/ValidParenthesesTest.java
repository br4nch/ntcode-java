package com.ntcode.stack;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class ValidParenthesesTest {

    private final ValidParentheses main = new ValidParentheses();

    @Test
    void isValid() {
        String input = "()";
        boolean res = main.isValid(input);
        assertTrue(res);
    }
}