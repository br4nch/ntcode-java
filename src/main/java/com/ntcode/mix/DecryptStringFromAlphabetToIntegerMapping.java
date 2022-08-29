package com.ntcode.mix;

public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int last = s.length() - 1;
        while (last >= 0) {
            final char c = s.charAt(last);
            if (c == '#') {
                int num = (s.charAt(last - 2) - '0') * 10 + (s.charAt(last - 1) - '0');
                sb.append((char) (num + 'a' - 1));
                last -= 3;
            } else {
                sb.append((char) (s.charAt(last) - '0' + 'a' - 1));
                last--;
            }
        }
        return sb.reverse().toString();
    }
}
