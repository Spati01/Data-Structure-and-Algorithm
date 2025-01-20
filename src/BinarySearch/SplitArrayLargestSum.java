package BinarySearch;

public class SplitArrayLargestSum {

    class Solution {
        public int splitArray(int[] nums, int k) {


            int  n = nums.length;
            int total = 0;
            int maxValue = Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){
                total += nums[i];
                maxValue = Math.max(maxValue, nums[i]);
            }

            int low = maxValue;
            int high = total;

            while(low <= high){
                int mid = low + (high - low) / 2;

                int split = isPossible(nums, mid);

                if(split > k){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            return low;
        }

        private int isPossible(int[] nums, int sum){
            int split = 1;
            int temp = 0;

            for(int i=0; i<nums.length; i++){
                if(temp + nums[i] <= sum){
                    temp += nums[i];
                }else{
                    split++;
                    temp = nums[i];
                }
            }

            return split;
        }
    }
}
