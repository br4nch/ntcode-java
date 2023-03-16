package com.ntcode.bitmanipulation;

public class BinaryGap {
    public static void main(String[] args) {
        int n1 = 22, n2 = 8, n3 = 5;
        System.out.println(binaryGap(n1));
        System.out.println(binaryGap(n2));
        System.out.println(binaryGap(n3));
    }

    public static int binaryGap(int n) {
        String s = "";
        int t = n;
        while (t > 0) {
            int r = t % 2;
            s = s + r + "";
            t = t / 2;
        }

        int mx = 0;
        int start = s.indexOf('1');
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                mx = Math.max(mx, i - start);
                start = i;
            }
        }
        return mx;
    }
}
