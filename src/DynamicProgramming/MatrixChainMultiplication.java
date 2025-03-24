package DynamicProgramming;

public class MatrixChainMultiplication {


    class Solution {
        static int matrixMultiplication(int arr[]) {
            // code here
            int n = arr.length;

            int[][] dp = new int[n+1][n+1];
            for(int len = 2; len<n; len++){
                int col = len;
                for(int row=0; row<n-len; row++){
                    dp[row][col] = Integer.MAX_VALUE;
                    for(int k=row+1; k<col; k++){
                        dp[row][col] = Math.min(dp[row][col],
                                dp[row][k] + dp[k][col] +
                                        arr[row] * arr[k] * arr[col]);
                    }
                    col++;
                }
            }

            return dp[0][n-1];
        }
    }
}
