package HashMapHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityVote {


    class Solution {
        // Function to find the majority elements in the array
        public List<Integer> findMajority(List<Integer> nums) {
            // Your code goes here.
            int n = nums.size();
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<nums.size(); i++){
                map.put(nums.get(i),map.getOrDefault(nums.get(i), 0) + 1);
            }

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > n/3){
                    list.add(entry.getKey());
                }

            }
            if(list.isEmpty()){
                list.add(-1);
            }

            return list;
        }
    }


}
