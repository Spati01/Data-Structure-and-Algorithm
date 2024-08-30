package HashMapHashSet;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();
        for(int[] pie : pieces) map.put(pie[0], pie);

        int idx = 0;
        while(idx < arr.length){
            if(!map.containsKey(arr[idx])){
                return false;
            }

            for(int x : map.get(arr[idx])){
                if(arr[idx] != x){
                    return false;
                }
                idx++;
            }
        }
        return true;
    }
}
