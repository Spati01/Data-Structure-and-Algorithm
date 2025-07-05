package Arrays;

public class MaxScoreFromSubarrayMins {

    class Solution {
        public int maxSum(int arr[]) {
            // code here
            int n = arr.length;
            int max = 0;

            for(int i=0; i<n-1; i++){
                max = Math.max(max, arr[i] + arr[i+1]);
            }

            return max;

        }
    }
}
