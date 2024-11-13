package BinarySearch;
import java.util.*;
public class CountTheNumberOfFairPairs {




    class Solution {
        public long countFairPairs(int[] nums, int lower, int upper) {
            Arrays.sort(nums);
            long ans = 0;
            for(int i=0; i<nums.length; i++){
                int low = lower - nums[i];
                int  high = upper - nums[i];
                long l = BinarySearchLeft(nums, i+1, low);
                long r = BinarySearchRight(nums, i+1, high);

                ans += r - l;

            }
            return ans;

        }

        private long BinarySearchLeft(int[] nums, int s, int low){

            int e = nums.length;

            while(s < e){
                int mid = s + (e - s) / 2;
                if(nums[mid] < low){
                    s = mid + 1;
                }else{
                    e = mid;
                }
            }
            return s;

        }
        private long BinarySearchRight(int[] nums, int s, int high){
            int e = nums.length;

            while(s < e){
                int mid = s + (e - s) / 2;
                if(nums[mid] > high){

                    e = mid;
                }else{
                    s = mid + 1;
                }
            }
            return s;
        }
    }
}
