package com.ntcode.array;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class FizzBuzzTest {

    private final FizzBuzz main = new FizzBuzz();

    @Test
    void fizzBuzz() {
        int n = 3;
        List<String> expected = List.of("1", "2", "Fizz");
        List<String> actual = main.fizzBuzz(n);
        assertEquals(expected, actual);
    }
}