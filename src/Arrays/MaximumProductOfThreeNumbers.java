package Arrays;
import java.util.*;
public class MaximumProductOfThreeNumbers {

    class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int max = Integer.MIN_VALUE;

            for(int i=0; i<nums.length; i++){
                int j = i+1;
                int k = nums.length-1;
                while(j < k){
                    max = Math.max(max, nums[i] * nums[j] * nums[k]);
                    j++;
                    k--;
                }
            }
            return max;
        }
    }
}
