package Arrays;

import java.util.HashMap;

public class CountTheNumberOfGoodSubarrays {
    public long countGood(int[] nums, int k) {
        int i = 0;
        int j = 0;
        long ans = 0;
        long count  = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j < nums.length){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            count += map.get(nums[j]) - 1;
            while(count >= k){
                ans += (nums.length - j);
                count -= map.get(nums[i]) - 1;
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }
            j++;
        }
        return ans;
    }
}
