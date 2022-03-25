package tutort.warmup4;

public class BestTimeToBuyAndSellStockII {// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

    public static void main(String[] args) {
        int res = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {// valley-peak approach, algo::https://www.youtube.com/watch?v=K8iHi8AW1ls
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
