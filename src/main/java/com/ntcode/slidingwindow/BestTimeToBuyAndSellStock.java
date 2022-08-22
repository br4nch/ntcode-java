package com.ntcode.slidingwindow;

public class BestTimeToBuyAndSellStock {
    public int execute(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            profit = Math.max(profit, p - min);
        }
        return profit;
    }
}
