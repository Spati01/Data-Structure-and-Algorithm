package DynamicProgramming;

public class CountSquareSubmatricesWithAllOnes {

    class Solution {
        public int countSquares(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int ans = 0;
            int[][] dp = new int[row][col];

            for(int i=0; i<row; i++){
                dp[i][0] = matrix[i][0];
                ans += dp[i][0];
            }

            for(int i=1; i<col; i++){
                dp[0][i] = matrix[0][i];
                ans += dp[0][i];
            }

            for(int i=1; i<row; i++){
                for(int j=1; j<col; j++){
                    if(matrix[i][j] == 1){
                        dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
                    }
                    ans += dp[i][j];
                }
            }
            return ans;

        }
    }
}
