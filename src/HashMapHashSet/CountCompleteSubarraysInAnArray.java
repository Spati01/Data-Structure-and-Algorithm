package HashMapHashSet;

import java.util.HashSet;

public class CountCompleteSubarraysInAnArray {

    class Solution {
        public int countCompleteSubarrays(int[] nums) {
            int n = nums.length;
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num);
            }

            int distinct = set.size();
            int count = 0;

            for(int start = 0; start<n; start++){
                HashSet<Integer> seen  = new HashSet<>();

                for(int end =start; end < n; end++){
                    seen.add(nums[end]);

                    if(seen.size() == distinct){
                        count++;
                    }
                }
            }


            return count;
        }
    }
}
