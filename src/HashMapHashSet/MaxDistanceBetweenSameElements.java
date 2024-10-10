package HashMapHashSet;

import java.util.HashMap;

public class MaxDistanceBetweenSameElements {

    class Solution {
        public int maxDistance(int[] arr) {
            // Code here
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i], i);
                }else{
                    max = Math.max(max,i - map.get(arr[i]));
                }
            }
            return max;
        }
    }

}
