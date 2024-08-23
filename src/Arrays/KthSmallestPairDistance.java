package Arrays;

import java.util.*;

// 1st approach

public class KthSmallestPairDistance {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];

        while(left < right){
            int mid = left + (right - left) / 2;
            if(countPair(nums, mid) < k){
                left = mid + 1;
            }else{
                right = mid;
            }
        }


        return left;

    }
    private int countPair(int[] nums, int mid){

        int count = 0;
        int left = 0;
        for(int right=0; right<nums.length; right++){
            while(nums[right] - nums[left] > mid){
                left++;
            }
            count += (right - left);

        }
        return count;

    }
}

// 2nd approach

class Solution {
    public int smallestDistancePair(int[] nums, int k) {


        int len = nums.length;
        int len2 = 1000000;
        int[] dp = new int[len2];
        for(int i=1; i<len; i++){
            for(int j=0; j<i; j++){


                int diff = Math.abs(nums[i] - nums[j]);
                dp[diff]++;
            }
        }

        int sum = 0;
        for(int i=0; i<len2; i++){
            sum += dp[i];
            if(sum >= k) return i;
        }
        return 0;

    }
}




