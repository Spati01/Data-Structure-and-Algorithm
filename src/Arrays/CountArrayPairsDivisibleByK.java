package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountArrayPairsDivisibleByK {

    class Solution {
        public long countPairs(int[] nums, int k) {
            long count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                int gcd = gcd(nums[i],k);
                for(int key : map.keySet()){
                    if((long) gcd * key % k == 0){
                        count += map.get(key);
                    }
                }
                map.put(gcd, map.getOrDefault(gcd, 0) +1);
            }
            return count;

        }
        private int gcd(int a, int b){
            return  b==0 ? a : gcd(b,a%b);
        }
    }
}
