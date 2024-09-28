package DynamicProgramming;

public class MaximumMultiplicationScore {

    class Solution {
        public long maxScore(int[] a, int[] b) {

            int n = b.length;
            long[][] dp = new long[n][4];
            for(int i=0; i<n; i++){
                for(int j = 0; j<4; j++){
                    dp[i][j] = Long.MIN_VALUE;
                }
            }

            dp[0][0] = (long) a[0] * b[0];

            for(int i=1; i<n; i++){
                dp[i][0] = Math.max(dp[i-1][0], (long) a[0] * b[i]);
                if(i >= 1){
                    dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + (long) a[1] * b[i]);
                }
                if(i >= 2){
                    dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1] + (long) a[2] * b[i]);
                }

                if(i >= 3){
                    dp[i][3] = Math.max(dp[i-1][3], dp[i-1][2] + (long) a[3] * b[i]);
                }
            }

            return dp[n-1][3];
        }
    }
}