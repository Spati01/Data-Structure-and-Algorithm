package Arrays;

import java.util.HashMap;

public class MaxSumOfAPairWithEqualSumOfDigits {

    class Solution {
        public int maximumSum(int[] nums) {
            int max_sum = -1;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num : nums){
                int temp = num;
                int sum = 0;
                while(temp > 0){
                    sum += temp % 10;
                    temp /= 10;
                }

                if(map.containsKey(sum)){
                    max_sum = Math.max(max_sum, map.get(sum) + num);
                }
                map.put(sum, Math.max(map.getOrDefault(sum, 0) , num));


            }
            return max_sum;
        }


    }
}
