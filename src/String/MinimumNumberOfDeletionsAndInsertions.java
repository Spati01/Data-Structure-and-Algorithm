package String;

import java.util.*;


// It is using longest common subsequence of the two strings and returns the removed/deleted and Insertions count

public class MinimumNumberOfDeletionsAndInsertions {

    public int minOperations(String str1, String str2)
    {
        // Your code goes here
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n+1][m+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

        int lcs =  longestCommonSubsequence(str1, str2, n, m, 0, 0, dp);

        return (m-lcs) + (n-lcs);
    }

    private int longestCommonSubsequence(String text1, String text2, int n, int m, int i, int j, int[][]dp){
        if(i > n-1 || j > m-1)return 0;
        if(dp[i][j] != -1)return dp[i][j];

        if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + longestCommonSubsequence(text1,text2,n,m,i+1,j+1,dp);

        }else{
            dp[i][j] = Math.max(longestCommonSubsequence(text1, text2, n, m, i+1, j, dp),
                    longestCommonSubsequence(text1, text2, n, m, i, j+1, dp));
        }
        return dp[i][j];
    }

}
