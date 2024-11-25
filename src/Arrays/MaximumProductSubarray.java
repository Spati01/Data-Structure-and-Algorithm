package Arrays;

public class MaximumProductSubarray {


    class Solution {
        // Function to find maximum product subarray
        int maxProduct(int[] arr) {
            // code here

            int max = Integer.MIN_VALUE;

            for(int i=0; i<arr.length; i++){
                int product = 1;
                for(int j=i; j<arr.length; j++){
                    product *= arr[j];
                    max = Math.max(max, product);
                }
            }
            return max;
        }
    }
}
