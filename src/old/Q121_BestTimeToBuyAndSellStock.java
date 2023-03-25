package old;

public class Q121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int[] minDP = new int[prices.length];
        minDP[0] = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minDP[i] = Math.min(minDP[i - 1], prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minDP[i - 1]);
        }
        return maxProfit;
    }
}
