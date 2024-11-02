package HashMapHashSet;

import java.util.HashMap;

public class KthDistance {

    class Solution {
        public boolean checkDuplicatesWithinK(int[] arr, int k) {
            // your code
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<arr.length; i++){
                if(map.containsKey(arr[i])){
                    if(Math.abs(i-map.get(arr[i])) <= k){
                        return true;
                    }
                }else{
                    map.put(arr[i], i);
                }
            }
            return false;
        }
    }
}
