package DynamicProgramming;

public class MaximumNumberOfPointswithCost {

    public long maxPoints(int[][] points) {

        int row = points.length;
        int col = points[0].length;
        long[] dp = new long[col];
        long res = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                dp[j] += points[i][j];
            }

            for(int j=1; j<col; j++){
                dp[j] = Math.max(dp[j], dp[j-1]-1);
            }

            for(int j=col-2; j>=0; j--){
                dp[j] = Math.max(dp[j], dp[j+1] - 1);
            }
        }

        for(int i=0; i<col; i++){
            res = Math.max(res,dp[i]);
        }

        return res;

    }


}
