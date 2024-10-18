package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    // TC:O(n)
    // SC:O(1)


    class Solution {
        int getSingle(int arr[]) {
            // code here
            int ans = 0;
            for(int i : arr){
                ans ^= i;
            }

            return ans;
        }
    }


    // TC:O(n)
    // SC:O(n)
    class SolutionMap{
        int getSingle(int arr[]) {
            // code here
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i : arr){
                map.put(i, map.getOrDefault(i, 0) + 1);

            }
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() % 2 != 0){
                    return entry.getKey();
                }
            }
            return 0;
        }
    }



}
