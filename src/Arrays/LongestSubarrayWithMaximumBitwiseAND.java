package Arrays;

public class LongestSubarrayWithMaximumBitwiseAND {

    class Solution {
        public int longestSubarray(int[] nums) {
            int max = 0;
            int count = 0;
            int maxCount = 0;
            for(int i = 0; i<nums.length; i++){
                max = Math.max(max, nums[i]);
            }

            for(int i=0; i<nums.length; i++){
                if(max == nums[i]){
                    count++;
                }else{
                    maxCount = Math.max(maxCount, count);
                    count = 0;

                }
            }

            maxCount = Math.max(maxCount, count);
            return maxCount == 0 ? 1 : maxCount;


        }
    }


}
