package BinarySearch;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    class Solution {
        public int maximumCount(int[] nums) {
            int n = nums.length;
            int posCount = binarySearch(nums, 0);
            int negCount = n - binarySearch(nums, 1);

            return Math.max(posCount,negCount);
        }

        private int binarySearch(int[] nums, int target){

            int result = 0;
            int left = 0;
            int right = nums.length-1;

            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    result = mid;
                    right = mid - 1;
                }
            }
            return result;
        }
    }

}
