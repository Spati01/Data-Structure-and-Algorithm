package Arrays;

import java.util.*;

public class MaximumBeautyOfAnArrayAfterApplyingOperation {

    class Solution {
        public int maximumBeauty(int[] nums, int k) {
            Arrays.sort(nums);
            int n = nums.length;
            int i=0, j=0;


            while(j<n){
                if(nums[j] - nums[i] > 2 * k){
                    i++;
                }
                j++;
            }

            return j-i;

        }
    }


}
