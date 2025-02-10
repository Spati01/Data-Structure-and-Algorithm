package Arrays;

import java.util.HashMap;

public @interface CountNumberOfBadPairs {

    class Solution {
        public long countBadPairs(int[] nums) {
            int n = nums.length;
            HashMap<Integer,Integer> map = new HashMap<>();
            long badPair = 0;
            for(int i=0; i<n; i++){

                int diff = i - nums[i];

                int goodPair = map.getOrDefault(diff,0);

                badPair += i - goodPair;

                map.put(diff, goodPair + 1);
            }

            return badPair;

        }
    }
}
