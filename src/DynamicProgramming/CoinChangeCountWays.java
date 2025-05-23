package DynamicProgramming;

import java.util.*;

public class CoinChangeCountWays {

    class Solution {
        public int count(int coins[], int sum) {
            // code here.
            int n = coins.length;
            int[][] dp = new int[n][sum + 1];
            for(int[] row : dp){
                Arrays.fill(row, -1);
            }

            return Helper(n-1, sum, coins, dp);
        }

        private int Helper(int index, int target, int[] coins, int[][] dp){

            if (index == 0) return (target % coins[0] == 0) ? 1 : 0;

            if(dp[index][target] != -1) return dp[index][target];

            int notTake = Helper(index - 1, target, coins, dp);
            int take = 0;

            if(coins[index] <= target){
                take = Helper(index, target - coins[index], coins,dp);
            }

            return dp[index][target] = take + notTake;
        }
    }
}
