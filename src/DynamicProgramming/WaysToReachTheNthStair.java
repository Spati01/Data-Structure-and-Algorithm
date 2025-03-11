package DynamicProgramming;

import java.util.*;


public class WaysToReachTheNthStair {


    class Solution {


        int countWays(int n) {
            // your code here
            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);
            return Helper(n, dp);
        }

        private int Helper(int n, int[] dp){
            if(n==1)return 1;
            if(n==2)return 2;
            if(dp[n] != -1)return dp[n];

            return  dp[n] = Helper(n-1, dp) + Helper(n-2, dp);



        }
    }

}
