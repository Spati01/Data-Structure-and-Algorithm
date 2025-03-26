package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class WordBreak {


    class Solution {
        public boolean wordBreak(String s, String[] dictionary) {
            // code here
            int n = s.length();
            Set<String> word = new HashSet<>(Arrays.asList(dictionary));

            boolean[] dp = new boolean[n+1];

            dp[0] = true;
            int maxLength = 0;

            for(String dic : dictionary){
                maxLength = Math.max(maxLength, dic.length());
            }

            for(int i=1; i<=n; i++){
                for(int j=Math.max(i-maxLength, 0); j<i; j++){
                    if(dp[j] && word.contains(s.substring(j, i))){
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[n];

        }
    }
}
