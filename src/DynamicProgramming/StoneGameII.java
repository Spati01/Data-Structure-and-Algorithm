package DynamicProgramming;

public class StoneGameII {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n+1];
        int[] suffex = new int[n];
        suffex[n-1] = piles[n-1];
        for(int i=n-2; i>= 0; i--){
            suffex[i] = suffex[i+1] + piles[i];
        }

        for(int i=n-1; i>= 0; i--){
            for(int m=1; m<=n; m++){
                if(i + 2*m >= n){
                    dp[i][m] = suffex[i];
                }else{

                    for(int x=1; x <= 2*m; x++){
                        dp[i][m] = Math.max(dp[i][m], suffex[i] - dp[i+x][Math.max(x,m)]);
                    }
                }
            }
        }
        return dp[0][1];
    }
}
