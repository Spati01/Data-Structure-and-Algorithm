package Arrays;

public class SearchInRotatedSortedArrayII {

    class Solution {
        public boolean search(int[] nums, int target) {

            int n = nums.length;

            int l = 0;
            int r = n - 1;

            while(l <= r){
                int mid = l + (r - l) / 2;
                if(nums[mid] == target) return true;
                if(nums[l] == nums[mid] && nums[r] == nums[mid]){
                    l++;
                    r--;
                }else if(nums[mid] >=  nums[l]){
                    if((nums[l] <= target) && (nums[mid] > target)) r = mid - 1;
                    else l = mid + 1;
                }else{
                    if((nums[mid] < target) && (nums[r] >= target)) l = mid + 1;
                    else r = mid - 1;


                }
            }

            return false;
        }
    }
}
