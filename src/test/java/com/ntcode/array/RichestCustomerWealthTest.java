package com.ntcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class RichestCustomerWealthTest {

    private final RichestCustomerWealth main = new RichestCustomerWealth();

    @Test
    void maximumWealth() {
        int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int expected = 6;
        int actual = main.maximumWealth(accounts);
        assertEquals(expected, actual);
    }
}