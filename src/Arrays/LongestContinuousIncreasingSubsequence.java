package Arrays;

public class LongestContinuousIncreasingSubsequence {


/*

class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int longest = 1;
        int l = 0;
        for(int i=1; i<nums.length; i++){
           if(nums[i] > nums[i-1]){
            longest = Math.max(longest, i - l + 1);
           }else{
            l = i;
           }

        }
        return longest;
    }
}
*/

    class Solution {
        public int findLengthOfLCIS(int[] nums) {

            int left = 0;
            int right = 1;
            int longest = 1;
            while(right < nums.length){
                if(nums[right] > nums[right - 1]){
                    longest = Math.max(longest, right - left + 1);

                }else{
                    left = right;
                }
                right++;
            }
            return longest;

        }
    }
}
