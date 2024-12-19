package BinarySearch;

public class KthMissingPositiveNumberInASortedArray {

    class Solution {
        public int kthMissing(int[] arr, int k) {
            // code here
            int low = 0;
            int high = arr.length - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(arr[mid] - mid <= k){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }

            return low + k;
        }
    }



}
