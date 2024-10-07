package Math;

import java.util.*;

public class SmallestRangeII {
    class Solution {
        public int smallestRangeII(int[] nums, int k) {
            Arrays.sort(nums);
            int n = nums.length;

            int range = nums[n-1] - nums[0];

            for(int i=1; i<n; i++){
                int min = Math.min(nums[0] + k, nums[i] - k);
                int max = Math.max(nums[i-1] + k, nums[n-1] - k);

                range = Math.min(range, max - min);
            }
            return range;
        }
    }
}
