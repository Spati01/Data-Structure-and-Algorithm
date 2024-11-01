package Arrays;

import java.util.*;

public class ArrayPartition {

    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int maxSum = 0;
            for(int i=0; i<nums.length; i+=2){
                maxSum += nums[i];
            }

            return maxSum;

        }
    }
}
