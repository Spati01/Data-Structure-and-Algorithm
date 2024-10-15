package HashMapHashSet;

import java.util.HashMap;

public class SubarrayRangeWithGivenSum {

    class Solution {
        // Function to count the number of subarrays which adds to the given sum.
        static int subArraySum(int arr[], int tar) {
            // add your code here
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0,1);
            int count = 0;
            int curSum = 0;
            for(int i=0; i<arr.length; i++){
                curSum += arr[i];
                if(map.containsKey(curSum - tar)){
                    count += map.get(curSum - tar);
                }else{
                    map.put(curSum, map.getOrDefault(curSum, 0) + 1);
                }
            }
            return count;

        }
    }
}
