package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
        private static int[][] dp;


        public static int strangePrinter(String s) {
            int n = s.length();
            dp = new int[n][n];
            for(int i=0; i<n; i++){
                Arrays.fill(dp[i], -1);
            }
            return minTurn(0,n-1,s);
        }

        private static int minTurn(int left, int right, String s){
            if(left == right) {
                return 1;
            }else if(left > right){
                return 0;
            }

            if(dp[left][right] != -1) return dp[left][right];

            int next = left + 1;
            while(next <= right && s.charAt(left) == s.charAt(next)){
                next++;
            }
            if(next == right + 1){
                return 1;
            }

            int withoutSplit = 1 + minTurn(next, right, s);
            int withSplit = Integer.MAX_VALUE;

            for(int i = next; i<= right; i++){
                if(s.charAt(i) == s.charAt(left)){
                    int turn = minTurn(next, i - 1, s) + minTurn(i, right, s);
                    withSplit = Math.min(turn, withSplit);

                }
            }

            return dp[left][right] = Math.min(withSplit,withoutSplit);
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            sc.nextLine();
            System.out.println(strangePrinter(s));
       }
}
