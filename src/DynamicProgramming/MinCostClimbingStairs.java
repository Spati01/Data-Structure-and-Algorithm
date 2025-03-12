package DynamicProgramming;

import java.util.Arrays;

public interface MinCostClimbingStairs {


    class Solution {
        static int minCostClimbingStairs(int[] cost) {
            // Write your code here
            int n = cost.length;
            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);

            return minCostReachTop(n, cost, dp);
        }

        private static int minCostReachTop(int n, int[] cost, int[] dp){
            if(n <= 1)return 0;
            if(n==2)return Math.min(cost[0], cost[1]);
            if(dp[n] != -1)return dp[n];

            dp[n] =  Math.min(minCostReachTop(n-1, cost,dp) + cost[n-1],
                    minCostReachTop(n-2, cost,dp)+cost[n-2]);

            return dp[n];
        }
    }
}
