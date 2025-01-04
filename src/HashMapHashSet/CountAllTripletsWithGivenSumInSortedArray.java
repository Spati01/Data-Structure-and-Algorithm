package HashMapHashSet;

import java.util.HashMap;

public class CountAllTripletsWithGivenSumInSortedArray {



    class Solution {
        public int countTriplets(int[] arr, int target) {
            // Code Here

            int count = 0;
            int n = arr.length;

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){

                    int sum = target - (arr[i] + arr[j]);

                    count += map.getOrDefault(sum , 0);
                }
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            return count;
        }
    }
}
