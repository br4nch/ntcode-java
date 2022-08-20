package com.ntcode.java.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequences {
    public static void main(String[] args) {
        int[] ex1 = new int[]{100, 4, 200, 1, 3, 2};
        int[] ex2 = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] ex3 = new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println(longestConsecutive(ex1));
        System.out.println(longestConsecutive(ex2));
        System.out.println(longestConsecutive(ex3));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> sets = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int ans = 1;
        for (Integer num :nums) {
            if (!sets.contains(num - 1)) {
                int count = 1;
                while(sets.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}
