package com.ntcode.array;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EncodeAndDecodeStringsTest {

    private final EncodeAndDecodeStrings main = new EncodeAndDecodeStrings();

    @Test
    void encode() {
        List<String> strs = List.of("lint", "code","love","you");
        String expected = "4#lint4#code4#love3#you";
        String res = main.encode(strs);
        assertEquals(expected, res);
    }

    @Test
    void decode() {
        String s = "4#lint4#code4#love3#you";
        List<String> expected = List.of("lint", "code","love","you");
        List<String> res = main.decode(s);
        assertEquals(expected, res);
    }
}