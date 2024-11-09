package HashMapHashSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {

    class Solution {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> left  = new HashMap<>(),
                    right = new HashMap<>(),
                    count = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                if(left.get(nums[i]) == null){
                    left.put(nums[i], i);
                }
                right.put(nums[i],i);
                count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            }
            int ans = Integer.MAX_VALUE;
            int degree = Collections.max(count.values());
            for(int key : count.keySet()){
                if(count.get(key) == degree){
                    ans = Math.min(ans, right.get(key) - left.get(key) + 1);
                }
            }

            return ans;
        }
    }
}
