package DynamicProgramming;

public class ZeroOneKnapsackProblem {

    static int knapSack(int w, int wt[], int val[]) {
        // your code here
        int n = val.length;
        int[][] dp = new int[n+1][w+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<w+1; j++){
                dp[i][j] = -1;
            }
        }

        return Solve(w,wt,val,n,dp);
    }
    private static  int Solve(int w, int[] wt, int[] val, int n, int[][] dp){

        if(n==0 || w == 0) return 0;

        if(dp[n][w] != -1) return dp[n][w];

        if(wt[n-1] > w){

            return dp[n][w] = Solve(w,wt,val,n-1,dp);
        }else{
            return  dp[n][w] = Math.max((val[n-1] + Solve(w - wt[n-1], wt, val, n-1, dp)),
                    Solve(w,wt,val,n-1,dp));
        }


    }
}
