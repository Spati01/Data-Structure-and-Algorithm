package Arrays;

public class MinimumEqualSumOfTwoArraysAfterReplacingZeros {

    class Solution {
        public long minSum(int[] nums1, int[] nums2) {


            long sum1 = 0;
            long sum2 = 0;

            long zero1 = 0;
            long zero2 = 0;

            for(int i=0; i<nums1.length; i++){
                sum1 += nums1[i] == 0 ? 1 : nums1[i];
                zero1 += nums1[i] == 0 ? 1 : 0;
            }

            for(int num : nums2){
                sum2 += num == 0 ? 1 : num;
                zero2 += num == 0 ? 1 : 0;
            }

            if((sum1 < sum2 && zero1 == 0) || (sum1 > sum2 && zero2 == 0))return -1;
            return Math.max(sum1, sum2);
        }
    }
}
