package DynamicProgramming;

import java.util.*;

public class PartitionEqualSubsetSum {



    class Solution {
        static boolean equalPartition(int arr[]) {
            // code here

            int n = arr.length;
            int total = Arrays.stream(arr).sum();

            if(total % 2  != 0)return false;
            total /= 2;

            int[][] dp = new int[n+1][total +1];

            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }




            return canPartition(n, arr, total, dp);


        }

        private static boolean canPartition(int n, int[] arr, int k, int[][] dp){

            if(dp[n][k] != -1)return dp[n][k] == 1;

            if(k == 0)return true;
            if(n == 0)return false;


            if(arr[n-1] <= k){
                boolean take = canPartition(n-1, arr, k - arr[n-1], dp) ||
                        canPartition(n-1, arr, k, dp);

                dp[n][k] = take ? 1 : 0;

                return take;
            }else {
                boolean notTake =  canPartition(n-1, arr, k, dp);
                dp[n][k] = notTake ? 1 : 0;
                return notTake;
            }
        }
    }
}
