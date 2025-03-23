package DynamicProgramming;

import java.util.*;

public class TotalDecodingMessages {


    // User function Template for Java
    class Solution {
        public int countWays(String digits) {
            // code here

            int n = digits.length();
            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);

            return totalNumberOfWay(n, digits, 0, dp);
        }

        private int totalNumberOfWay(int n, String digits, int i, int[] dp){

            if(i == n) return 1;
            if(digits.charAt(i) == '0')return 0;

            if(dp[i] != -1)return dp[i];

            int oneDigits = totalNumberOfWay(n, digits, i+1, dp);
            int twoDigits = 0;

            if(i != n-1 && (digits.charAt(i) == '1' || digits.charAt(i) == '2'  && digits.charAt(i+1) <= '6')){
                twoDigits = totalNumberOfWay(n, digits, i+2, dp);
            }
            return dp[i] = oneDigits + twoDigits;

        }
    }

}
