public class Q121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, i = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[i] < prices[j]) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            } else {
                i = j;
            }
        }
        return maxProfit;
    }
}
