package DynamicProgramming;

import java.util.*;

public class SticklerThiefII {



    class Solution {
        int maxValue(int[] arr) {
            // code here
            int n = arr.length;

            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);

            int case1 = maxStolen(n, arr, 1,dp);
            Arrays.fill(dp, -1);
            int case2 =  maxStolen(n-1, arr, 0, dp);

            return Math.max (case1, case2);

        }

        private int maxStolen(int n, int[] arr, int i, int[] dp){

            if(i >= n)return 0;

            if(dp[i] != -1)return dp[i];


            return dp[i] = Math.max(maxStolen(n,arr,i+2, dp) + arr[i],
                    maxStolen(n, arr, i+1, dp));
        }
    }
}
