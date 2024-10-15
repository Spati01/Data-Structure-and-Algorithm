package DynamicProgramming;

import java.util.*;

public class PerfectSumProblem {

    class Solution{

        int MOD = 1000000007;

        public int perfectSum(int arr[],int n, int sum)
        {
            // Your code goes here
            int[][] dp = new int[n+1][sum+1];
            for(int i=0; i<= n; i++){
                Arrays.fill(dp[i], -1);
            }
            return countSubset(arr, n, sum,dp) % MOD;


        }

        private int countSubset(int[] arr, int n, int sum, int[][] dp){

            if(dp[n][sum] != -1) return dp[n][sum];

            if(n==0 && sum > 0)return 0;
            else if(n == 1){
                if(sum == 0){
                    return arr[0] == 0 ? 2 : 1;
                }else{
                    return arr[0] == sum ? 1 : 0;
                }
            }
            else if(n==0 && sum == 0)return 1;


            int ans = countSubset(arr, n-1, sum,dp)%MOD;
            if(arr[n-1] <= sum){
                ans+=countSubset(arr, n-1, sum - arr[n-1],dp);
                ans %= MOD;
            }

            return dp[n][sum] = ans;
        }
    }
}
