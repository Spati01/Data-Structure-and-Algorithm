package Arrays;

public class MaximumSubarray {

    class Solution {
        public int maxSubArray(int[] nums) {

            int max = Integer.MIN_VALUE;

            for(int i=0; i<nums.length; i++){
                int sum = 0;
                for(int j=i; j<nums.length; j++){
                    sum += nums[j];
                    max = Math.max(max, sum);
                    if(sum < 0) sum = 0;
                }
            }

            return max;
        }
    }
}
