package Arrays;

import java.util.HashMap;
import java.util.List;

public class CountOfInterestingSubarrays {

    class Solution {
        public long countInterestingSubarrays(List<Integer> nums, int mod, int k) {


            HashMap<Integer,Integer> map = new HashMap<>();

            map.put(0, 1);
            long result = 0;
            int count = 0;

            for(int num : nums){
                if(num % mod == k)count++;

                int modVal =count % mod;
                int target = (modVal - k + mod)%mod;

                result += map.getOrDefault(target, 0);

                map.put(modVal, map.getOrDefault(modVal,0) + 1);
            }

            return result;
        }
    }
}
