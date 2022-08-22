package com.ntcode.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("small")
class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void execute() {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 5;
        int res = bestTimeToBuyAndSellStock.execute(arr);
        assertEquals(expected, res);
    }
}