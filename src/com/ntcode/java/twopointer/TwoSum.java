package com.ntcode.java.twopointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] ex1 = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(ex1, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (res.containsKey(nums[i])) {
                return new int[]{res.get(num), i};
            }

            res.put(diff, i);
        }

        return new int[]{};
    }
}
