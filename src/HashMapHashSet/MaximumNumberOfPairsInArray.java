package HashMapHashSet;

import java.util.HashMap;

public class MaximumNumberOfPairsInArray {

    class Solution {
        public int[] numberOfPairs(int[] nums) {
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    map.remove(nums[i]);
                    count++;
                } else {
                    map.put(nums[i], 1);
                }
            }

            return new int[]{count, map.size()};
        }
    }
}
