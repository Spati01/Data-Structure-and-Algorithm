package BinarySearch;

public class FindTheSmallestDivisorGivenAThreshold {

    class Solution {

        public int smallestDivisor(int[] nums, int threshold) {

            int s = 1;
            int e = Integer.MIN_VALUE;

            for(int i=0; i<nums.length; i++){
                if(nums[i] > e){
                    e = nums[i];
                }
            }
            int ans = -1;
            while(s <= e){
                int mid = s + (e - s) / 2;
                if(isDivisor(nums, mid, threshold)){
                    ans = mid;
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }

            return ans;
        }

        private boolean isDivisor(int[] nums, int divisor, int hold){

            int sum = 0;
            for(int i=0; i<nums.length; i++){
                sum += nums[i] / divisor;

                if(nums[i] % divisor != 0)sum++;

                if(sum > hold) return false;
            }

            return true;
        }


    }
}
