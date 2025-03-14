package BinarySearch;

import java.util.*;


public class ZeroArrayTransformationII {


    class Solution {
        public int minZeroArray(int[] nums, int[][] queries) {
            int n = nums.length;

            if(Arrays.stream(nums).allMatch(x -> x == 0))return 0;
            int left = 1, right = queries.length;
            if(!canMakeZeroArray(n,right, nums, queries)) return -1;

            while(left < right){
                int mid = left + (right - left) / 2;
                if(canMakeZeroArray(n,mid,nums, queries)){
                    right  = mid;
                }else{
                    left = mid + 1;
                }
            }

            return left;


        }
        private boolean canMakeZeroArray(int n,int k, int[] nums, int[][] queries){
            int[] diff = new int[n+1];

            for(int i=0; i<k; i++){
                int start = queries[i][0];
                int end =   queries[i][1];
                int val =   queries[i][2];

                diff[start] += val;
                diff[end+1] -= val;
            }

            int current = 0;
            for(int i=0; i<n; i++){
                current += diff[i];
                if(current < nums[i]) return false;
            }

            return true;
        }
    }
}
