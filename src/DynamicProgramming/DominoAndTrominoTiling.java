package DynamicProgramming;


import java.util.*;

public class DominoAndTrominoTiling {

    class Solution {

        int MOD = 1000000007;
        public int numTilings(int n) {

            int[] dp = new int[1001];
            Arrays.fill(dp, -1);

            return solver(n, dp);
        }

        private int solver(int n, int[] dp){

            if(n == 1 || n == 2)return n;
            if(dp[n] != -1)return dp[n];
            if(n == 3)return 5;

            return dp[n] = (2 * solver(n-1, dp) % MOD + solver(n-3, dp)%MOD)%MOD;
        }
    }
}
