package Arrays;

import java.util.HashMap;
import java.util.*;

public class NumberOfArithmeticTriplets {

    class Solution {
        public int arithmeticTriplets(int[] nums, int diff) {

            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
            return count;

        }



        public int arithmeticTripletsUsingMap(int[] nums, int diff) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int counter = 0;
            for(int i = 0; i<nums.length; i++){
                map.put(nums[i], i);

            }
            for(int num : nums){
                if(map.containsKey(num + diff) && map.containsKey(num + 2 * diff)){
                    counter++;
                }
            }
            return counter;

        }
    }
}


