package DynamicProgramming;

public class MinimalCost {


    class Solution {
        public int minimizeCost(int k, int arr[]) {
            // code here
            int[] dp = new int[arr.length];
            for(int i=arr.length-2; i>= 0; i--){
                int min = Integer.MAX_VALUE;
                for(int j=1; j<=k; j++){
                    if(i + j < arr.length){
                        int x = dp[i + j];
                        x += Math.abs(arr[i] - arr[i+j]);
                        min = Math.min(min, x);
                    }
                }
                dp[i] = min;
            }


            return dp[0];
        }
    }


}
