package Greedy;

import java.util.*;

public class DivideArrayIntoArraysWithMaxDifference {

    class Solution {
        public int[][] divideArray(int[] nums, int k) {

            int n = nums.length;

            int[][] result = new int[n/3][3];
            int idx = 0;

            Arrays.sort(nums);

            for(int i=0; i<n; i+=3){
                int first = nums[i];
                int second = nums[i+1];
                int third = nums[i+2];

                if(third - first <= k){
                    result[idx][0] = first;
                    result[idx][1] = second;
                    result[idx][2] = third;
                    idx++;
                }else{
                    return new int[0][0];
                }
            }

            return result;
        }
    }


}
