public class Day_08_stockBuyAndSell_II {

    public int maximumProfit(int prices[]) {
        // code here
        if (prices.length == 1) {
            return 0;
        }

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
