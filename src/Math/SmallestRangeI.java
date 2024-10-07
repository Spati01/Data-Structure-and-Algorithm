package Math;

public class SmallestRangeI {
    class Solution {
        public int smallestRangeI(int[] nums, int k) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int num : nums){
                max = Math.max(max, num);
                min = Math.min(min, num);

            }

            int diff = Math.max(0, max - min - k * 2);

            return diff;
        }
    }
}
