package DynamicProgramming;

import java.util.*;

public class MaximizeTheCutSegments {


    public int maximizeCuts(int n, int x, int y, int z)
    {
        //Your code here
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = Solve(dp,n,x,y,z);

        return ans < 0 ? 0 : ans;

    }

    private int Solve(int[] dp, int n, int x, int y, int z){

        if(n==0) return 0;
        if(n<0) return Integer.MIN_VALUE;
        if(dp[n] != -1) return dp[n];

        int a = Solve(dp,n-x, x, y, z) + 1;
        int b = Solve(dp,n-y, x, y, z) + 1;
        int c = Solve(dp, n-z, x, y, z) + 1;

        dp[n] = Math.max(a, Math.max(b,c));

        return dp[n];


    }
}
