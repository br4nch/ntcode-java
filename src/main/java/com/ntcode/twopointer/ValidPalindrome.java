package com.ntcode.twopointer;

public class ValidPalindrome {
    public static void main(String[] args) {
        String ex1 = "A man, a plan, a canal: Panama";
        String ex2 = "race a car";
        System.out.println(isPalindrome(ex1));
        System.out.println(isPalindrome(ex2));
    }

    public static boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();
        int last = arr.length - 1;
        int mid = arr.length / 2;

        for (int i = 0; i < mid; i++) {
            if (arr[i] != arr[last]) {
                return false;
            }
            last--;
        }
        return true;
    }

    public static boolean isPalindromeV2(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            char start = s.charAt(i);
            char end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
