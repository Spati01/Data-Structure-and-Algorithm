package HashMapHashSet;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrence {

    class Solution {
        int countFreq(int[] arr, int target) {
            // code here

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int num : arr){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int result = 0;

            for(Map.Entry<Integer, Integer>  entry : map.entrySet()){
                if(entry.getKey() == target){
                    result =  entry.getValue();

                }
            }

            return result;
        }
    }

}
