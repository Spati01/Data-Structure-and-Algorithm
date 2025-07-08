package DynamicProgramming;

import java.util.*;


public class MaximumNumberOfEventsThatCanBeAttendedII {

    class Solution {
        public int maxValue(int[][] events, int k) {

            int n = events.length;
            Arrays.sort(events, (a,b)-> Integer.compare(a[0], b[0]));

            int[][] dp = new int[n+1][k+1];

            for(int i=0; i<=n; i++){
                for(int j=0; j<=k; j++){
                    dp[i][j] = -1;
                }
            }


            return Helper(events, n, 0, k, dp);
        }

        private int Helper(int[][] events, int n, int index, int k, int[][] dp){

            if(index >= n || k == 0)return 0;

            if(dp[index][k] != -1)return dp[index][k];

            int skip = Helper(events, n, index + 1, k,dp);

            int next = binarySearch(n, events, events[index][1]);

            int take = events[index][2] + Helper(events, n, next, k-1,dp);



            return dp[index][k] = Math.max(take, skip);


        }

        private int binarySearch(int n, int[][] events, int target){

            int low = 0;
            int high = n;

            while(low < high){
                int mid = low + (high - low) / 2;

                if(events[mid][0] > target){
                    high = mid;
                }else{
                    low = mid + 1;
                }
            }

            return low;
        }
    }
}
