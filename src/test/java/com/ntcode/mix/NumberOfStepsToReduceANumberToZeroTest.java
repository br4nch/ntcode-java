package com.ntcode.mix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class NumberOfStepsToReduceANumberToZeroTest {

    private final NumberOfStepsToReduceANumberToZero main = new NumberOfStepsToReduceANumberToZero();

    @Test
    void numberOfSteps() {
        int num = 14;
        int expected = 6;
        int actual = main.numberOfSteps(num);
        assertEquals(expected, actual);
    }
}