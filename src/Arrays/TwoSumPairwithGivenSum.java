package Arrays;

import java.util.HashMap;

public class TwoSumPairwithGivenSum {

    class Solution {
        boolean twoSum(int arr[], int target) {
            // code here

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<arr.length; i++){
                map.put(arr[i],i);
            }

            for(int i=0; i<arr.length; i++){
                if(map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i){
                    return true;
                }
            }
            return false;
        }
    }
}
