package HashMapHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

    class Solution {
        // Function to find the majority elements in the array
        public List<Integer> findMajority(int[] nums) {
            // Your code goes here.
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);

            }
            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                if(entry.getValue() > n/3){
                    list.add(entry.getKey());
                }
            }
            return list;
        }
    }
}
