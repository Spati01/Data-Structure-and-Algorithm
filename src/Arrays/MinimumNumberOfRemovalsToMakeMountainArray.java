package Arrays;

import java.util.*;

public class MinimumNumberOfRemovalsToMakeMountainArray {

    class Solution {
        public int minimumMountainRemovals(int[] nums) {
            int n = nums.length;
            int[] incr = new int[n];
            int[] decr = new int[n];
            Arrays.fill(incr,1);
            Arrays.fill(decr,1);

            for(int i=0; i<n; i++){
                for(int j=0; j< i; j++){
                    if(nums[i] > nums[j]){
                        incr[i] = Math.max(incr[i], incr[j] + 1);
                    }
                }
            }
            for(int i=n-1; i>=0; i--){
                for(int j=n-1; j>i; j--){
                    if(nums[i] > nums[j]){
                        decr[i] = Math.max(decr[i], decr[j] + 1);
                    }
                }
            }

            int ans = 0;
            for(int i=0; i<n; i++){
                if(incr[i] != 1 && decr[i] != 1){
                    ans = Math.max(ans, incr[i] + decr[i]);
                }
            }
            return n-ans+1;

        }
    }


}
