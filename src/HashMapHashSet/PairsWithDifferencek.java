package HashMapHashSet;

import java.util.HashMap;

public class PairsWithDifferencek {
    class Solution {
        int countPairsWithDiffK(int[] arr, int k) {
            // code here
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num : arr){
                map.put(num,map.getOrDefault(num, 0)+1);
            }
            int count = 0;
            for(int num : arr){
                if(map.containsKey(num - k)){
                    count+=map.get(num - k);
                }

            }
            return count;
        }
    }
}
