package BitManipulation;

public class LongestNiceSubarray {

    class Solution {
        public int longestNiceSubarray(int[] nums) {
            int n = nums.length;
            int len = 0;
            int left = 0;
            int bitMask = 0;

            for(int right=0; right<n; right++){

                while((bitMask & nums[right]) != 0){
                    bitMask ^= nums[left];
                    left++;
                }

                bitMask |= nums[right];
                len = Math.max(len, right-left + 1);
            }



            return len;
        }
    }
}
