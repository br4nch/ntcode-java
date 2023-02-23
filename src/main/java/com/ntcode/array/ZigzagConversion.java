package com.ntcode.array;

public class ZigzagConversion {
    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert(input, numRows));
    }

    public static String convert(String s, int numRows) {
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuffer();
        }
        int i = 0;
        while (i < len) {
            for (int index = 0; index < numRows && i < len; index++) {
                sb[index].append(charArr[i++]);

            }
            for (int index = numRows - 2; index >= 1 && i < len; index--) {
                sb[index].append(charArr[i++]);
            }
        }
        for (int j = 1; j < sb.length; j++) {
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }
}
