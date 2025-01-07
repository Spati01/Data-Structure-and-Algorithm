package HashMapHashSet;

import java.util.HashMap;

public class PairWithGivenSumInASortedArray {



    class Solution {

        int countPairs(int arr[], int target) {
            // Complete the function
            int n = arr.length;
            int count = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                int complement = target - arr[i];

                if(map.containsKey(complement)){

                    count += map.get(complement);

                }

                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);


            }

            return count;
        }
    }
}
