package HashMapHashSet;

import java.util.HashMap;

public class LongestSubArrayWithSumK {


    class Solution {
        public int lenOfLongestSubarr(int[] arr, int k) {
            // code here

            int maxLength = Integer.MIN_VALUE;

            int count = 0;
            int sum = 0;

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);

            for(int i=0; i<arr.length; i++){
                sum += arr[i];

                if(map.containsKey(sum - k)){
                    count = i - map.get(sum - k);

                    if(count > maxLength){
                        maxLength = count;
                    }
                }

                if(!map.containsKey(sum)){
                    map.put(sum, i);
                }
            }

            return maxLength;
        }
    }

}
