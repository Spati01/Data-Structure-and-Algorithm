package Arrays;

public class KadanesAlgorithm {

    class Solution {

        // arr: input array
        // Function to find the sum of contiguous subarray with maximum sum.
        int maxSubarraySum(int[] arr) {

            // Your code here
            int sum = arr[0];
            int con = arr[0];

            for(int i=1; i<arr.length; i++){
                sum = Math.max(arr[i], sum+arr[i]);
                con = Math.max(sum, con);
            }

            return con;
        }
    }
}
