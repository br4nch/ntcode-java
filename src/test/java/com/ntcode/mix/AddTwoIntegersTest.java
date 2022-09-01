package com.ntcode.mix;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class AddTwoIntegersTest {

    private final AddTwoIntegers main = new AddTwoIntegers();

    @Test
    void sum() {
        int n1 = 2;
        int n2 = 3;
        int expected = n1 + n2;
        int res = main.sum(n1, n2);
        assertEquals(expected, res);
    }
}