package com.ntcode.array;

public class AlienDictionary {
    public static void main(String[] args) {
        String[] words1 = new String[]{"hello", "leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words2 = new String[]{"word", "worlds", "row"};
        String order2 = "worldabcefghijkmnpqstuvxyz";
        String[] words3 = new String[]{"apple", "app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(isAlienSorted(words1, order1));
        System.out.println(isAlienSorted(words2, order2));
        System.out.println(isAlienSorted(words3, order3));
    }

    private static boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = new int[26];

        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j >= words[i + 1].length()) return false;

                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int currentWordChar = words[i].charAt(j) - 'a';
                    int nextWordChar = words[i + 1].charAt(j) - 'a';
                    if (orderMap[currentWordChar] > orderMap[nextWordChar]) return false;
                    else break;
                }
            }
        }

        return true;
    }
}
