package Greedy;

import java.util.*;


public class PartitionArraySuchThatMaximumDifferenceIsK {


    class Solution {
        public int partitionArray(int[] nums, int k) {

            if(nums.length <= 1)return nums.length;
            Arrays.sort(nums);
            int min_val = nums[0];
            int count = 1;
            for(int i=1; i<nums.length; i++){
                if(nums[i] - min_val <= k){
                    continue;
                }else{
                    count++;
                    min_val = nums[i];
                }
            }
            return count;
        }
    }




}
