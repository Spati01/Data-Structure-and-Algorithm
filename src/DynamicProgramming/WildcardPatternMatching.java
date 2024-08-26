package DynamicProgramming;

public class WildcardPatternMatching {

    private boolean[][] dp;

    public int wildCard(String pp, String ss) {
        // Your code goes here
        int nn = pp.length();
        int mm = ss.length();
        dp = new boolean[nn+1][mm+1];
        dp[0][0] = true;
        for(int i=1; i<mm; i++){
            dp[0][1] = false;
        }

        return matching(nn,mm,pp,ss);

    }

    private int matching(int n, int m, String p, String s){
        for(int i=1; i<=n; i++){
            if(p.charAt(i-1) == '*'){
                dp[i][0] = dp[i-1][0];
            }else{
                dp[i][0] = false;
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<= m; j++){
                if(p.charAt(i-1) == s.charAt(j-1) || p.charAt(i-1) == '?'){
                    dp[i][j] =dp[i-1][j-1];
                }else if(p.charAt(i-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }

        return dp[n][m] ? 1 : 0;
    }
}
