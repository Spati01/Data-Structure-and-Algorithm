package HashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TheTwoSneakyNumbersOfDigitville {

    class Solution {
        public int[] getSneakyNumbersSET(int[] nums) {

            HashSet<Integer> set = new HashSet<>();
            int[] res = new int[2];
            int k = 0;
            for(int i=0; i<nums.length; i++){
                if(set.contains(nums[i])){
                    res[k++] = nums[i];
                }else{
                    set.add(nums[i]);
                }
            }

            return res;
        }


        public int[] getSneakyNumbersMAP(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            int[] res = new int[2];
            int k = 0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() == 2){
                    res[k++] = entry.getKey();
                }
            }
            return res;

        }

    }





}
