package com.ntcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] ex1 = new int[]{1, 1, 1, 2, 2, 3};
        int[] ex2 = new int[]{1};
        int[] ex3 = new int[]{1, 2};
        int[] ex4 = new int[]{3, 0, 1, 0};
        System.out.println(Arrays.toString(topKFrequent(ex1, 2)));
        System.out.println(Arrays.toString(topKFrequent(ex2, 1)));
        System.out.println(Arrays.toString(topKFrequent(ex3, 2)));
        System.out.println(Arrays.toString(topKFrequent(ex4, 1)));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}
