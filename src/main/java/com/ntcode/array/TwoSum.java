package com.ntcode.array;

import java.util.HashMap;

public class TwoSum {
    public int[] execute(int[] nums, int target) {
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
