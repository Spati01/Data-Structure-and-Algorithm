package Arrays;

import java.util.*;

public class MinimizeMaximumPairSumInArray {
    class Solution {
        public int minPairSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int i = 0;
            int j = n-1;
            int max = Integer.MIN_VALUE;
            while(i < j){
                max = Math.max(nums[i] + nums[j], max);
                i++;
                j--;
            }
            return max;
        }
    }



}
