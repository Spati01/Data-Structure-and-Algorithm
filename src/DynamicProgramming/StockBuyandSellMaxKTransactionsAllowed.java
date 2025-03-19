package DynamicProgramming;

import java.util.*;


public class StockBuyandSellMaxKTransactionsAllowed {



    class Solution {
        static int maxProfit(int prices[], int k) {
            // code here

            int n = prices.length;
            int[][][] dp = new int[n][k+1][2];

            for(int i=0; i<n; i++){
                for(int j=0; j<= k; j++){
                    Arrays.fill(dp[i][j], -1);
                }
            }
            return solve(prices, k, 0, 1, dp);

        }

        private static int solve(int[] prices, int k, int i, int canBuy,  int[][][] dp){



            if(i == prices.length || k == 0)return 0;

            if(dp[i][k][canBuy] != -1)return dp[i][k][canBuy];

            int involve = 0;
            int ignore = 0;

            if(canBuy == 1){

                involve = -  prices[i] + solve(prices, k, i+1, 0,dp);
                ignore = solve(prices, k, i+1, 1, dp);
            }else{

                involve = prices[i] + solve(prices, k-1, i+1, 1, dp);
                ignore = solve(prices, k, i+1, 0, dp);
            }


            return dp[i][k][canBuy] =  Math.max(involve, ignore);


        }


    }
}
