package Arrays;

public class StockBuyAndSellMaxOneTransactionAllowed {

    class Solution {
        public int maximumProfit(int prices[]) {
            // Code here'
            int n = prices.length;
            int maxProfit = 0;
            int minProfit = prices[0];

            for(int price : prices){
                minProfit = Math.min(minProfit, price);
                maxProfit = Math.max(maxProfit, price - minProfit);
            }
            return maxProfit;
        }
    }
}
