package Arrays;

public class StockBuyAndSell {

    class Solution {
        public int maximumProfit(int prices[]) {
            // code here
            int n = prices.length;
            int pre = 0;


            for(int i=1; i<n; i++){
                if(prices[i] > prices[i-1]){
                    pre += (prices[i] - prices[i-1]);
                }

            }
            return pre;
        }
    }


}
