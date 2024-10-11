package Arrays;

public class KthMissingPositiveNumber {
    class Solution {
        public int findKthPositive(int[] arr, int k) {

            for(int i : arr){
                if(i <= k){
                    k++;
                }
            }
            return k;
        }
    }
// Using Binary Search approach


        public int findKthPositive(int[] arr, int k) {
            return binarySearch(arr, k);

        }
        private int binarySearch(int[] arr, int k){
            int low = 0;
            int high = arr.length - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;
                int missing = arr[mid] - (mid  + 1);

                if(missing < k){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }

            }

            return k + high + 1;
        }
}
