package HashMapHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {


    class Solution {
        public int sumOfUnique(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();

            HashMap<Integer, Integer> unique = new HashMap<>();
            for(int num : nums){
                unique.put(num, unique.getOrDefault(num, 0) + 1);
            }

            for(Map.Entry<Integer, Integer> map  : unique.entrySet()){
                if(map.getValue() == 1){
                    list.add(map.getKey());
                }
            }

            int sum = 0;
            for(int num : list){
                sum += num;
            }

            return sum;

        }
    }
}
