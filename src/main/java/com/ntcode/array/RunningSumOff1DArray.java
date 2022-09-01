package com.ntcode.array;

public class RunningSumOff1DArray {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        for (int i = nums.length - 1; i >= 0; ) {
            res[i] = sum;
            sum -= nums[i--];
        }

        return res;
    }
}
