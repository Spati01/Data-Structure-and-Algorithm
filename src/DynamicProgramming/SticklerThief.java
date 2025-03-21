package DynamicProgramming;

import java.util.*;

public class SticklerThief {



    class Solution {
        public int findMaxSum(int arr[]) {
            // code here

            int n = arr.length;
            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);
            return maxAmountCanLoot(arr, n, 0,dp);

        }


        private int maxAmountCanLoot(int[] arr, int n, int idx, int[] dp){

            if(idx >= n)return 0;
            if(dp[idx] != -1)return dp[idx];

            return dp[idx] = Math.max(maxAmountCanLoot(arr, n, idx+2, dp) + arr[idx],
                    maxAmountCanLoot(arr, n, idx + 1, dp));
        }

    }
}
