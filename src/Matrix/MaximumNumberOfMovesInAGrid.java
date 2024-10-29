package Matrix;

import java.util.*;

public class MaximumNumberOfMovesInAGrid {
    class Solution {
        public int maxMoves(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            int max = 0;
            int[][] dp = new int[row][col];
            for(int[] a : dp) Arrays.fill(a, -1);
            for(int i=0; i<row; i++){
                max = Math.max(max, getMax(grid,i,0,row, col,dp));
            }
            return max;
        }
        private int getMax(int[][] grid, int i, int j, int row, int col,int[][] dp){


            if(i == row && j == col)return 0;
            if(dp[i][j] != -1) return dp[i][j];
            int max = 0;
            if(i-1 >= 0 && j+1 < col && grid[i-1][j+1] > grid[i][j]){
                max = 1 + getMax(grid,i-1,j+1,row,col,dp);
            }

            if(j+1 < col && grid[i][j+1] > grid[i][j]){
                max = Math.max(max, 1 + getMax(grid,i,j+1,row,col,dp));
            }

            if(i+1 < row && j+1 < col && grid[i+1][j+1] > grid[i][j]){
                max = Math.max(max, 1 + getMax(grid,i+1,j+1,row,col,dp));
            }

            return dp[i][j] = max;
        }
    }
}
