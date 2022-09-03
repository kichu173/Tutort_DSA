package tutort.warmup4;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int profit = maxProfit(new int[]{7, 6, 4, 3, 1});// 7,6,4,3,1 | 7, 1, 5, 3, 6, 4
        System.out.println(profit);// 5 | 0
        int profit1 = maxProfitOptimal(new int[]{7, 6, 4, 3, 1});// 7,6,4,3,1 | 7, 1, 5, 3, 6, 4
        System.out.println(profit1);// 5 | 0
        int profit2 = maxProfitOptimal1(new int[]{7, 1, 5, 3, 6, 4});// 7,6,4,3,1 | 7, 1, 5, 3, 6, 4
        System.out.println(profit2);// 5 | 0
    }

    private static int maxProfit(int[] prices) { // Brut Force (https://takeuforward.org/data-structure/stock-buy-and-sell/)
        List<Integer> profit = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > max) {
                    max = prices[j];
                }
            }
            if (max > prices[i]) {
                int total = max - prices[i];
                profit.add(total);
            }
            max = Integer.MIN_VALUE;
        }
        if (profit.size() <= 0) {
            return 0;
        }
        for (Integer num : profit) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int maxProfitOptimal(int[] prices) {
        List<Integer> profit = new ArrayList<>();
        int[] max = new int[prices.length];
        // calculate the right tallest
        max[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            max[i] = Math.max(prices[i], max[i + 1]);
        }
        for (int i = 0; i < max.length; i++) {
            if (max[i] > prices[i]) {
                int total = max[i] - prices[i];
                profit.add(total);
            }
        }
        if (profit.size() <= 0) {
            return 0;
        }
        int maxEl = Integer.MIN_VALUE;
        for (int i = 0; i < profit.size(); i++) {
            if (profit.get(i) > maxEl) {
                maxEl = profit.get(i);
            }
        }
        return maxEl;
    }

    public static int maxProfitOptimal1(int[] prices) {//TC: O(n) algorithm:: https://www.youtube.com/watch?v=eMSfBgbiEjk
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
//            min=Math.min(min,prices[i]);
//            max=Math.max(max,prices[i]-min);
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
