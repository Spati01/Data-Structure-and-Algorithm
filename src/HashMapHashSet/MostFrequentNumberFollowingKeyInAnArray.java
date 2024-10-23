package HashMapHashSet;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberFollowingKeyInAnArray {

    class Solution {
        public int mostFrequent(int[] nums, int key) {
            int max = 0;
            int ans = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] == key){
                    if(map.containsKey(nums[i+1]))
                        map.put(nums[i+1], map.getOrDefault(nums[i+1], 0)+1);
                    else
                        map.put(nums[i+1], 1);
                    if(map.get(nums[i+1]) > max){
                        max = map.get(nums[i+1]);
                        ans = nums[i+1];
                    }
                }
            }
            return ans;
        }
    }
}
