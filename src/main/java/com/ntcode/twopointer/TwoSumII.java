package com.ntcode.twopointer;

public class TwoSumII {
    public int[] execute(int[] nums, int target) {
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 < p2) {
            int numA = nums[p1];
            int numB = nums[p2];
            if (numA + numB == target) break;
            if (numA + numB < target) {
                p1++;
                continue;
            }
            p2--;
        }
        return new int[]{p1 + 1, p2 + 1};
    }
}
