package BinarySearch;

public class AllocateMinimumPages {


    class Solution {
        public static int findPages(int[] arr, int k) {
            // code here
            int n = arr.length;
            if(k > n)return -1;

            int sum = 0;
            int max = Integer.MIN_VALUE;

            for(int i=0; i<n; i++){
                sum += arr[i];
                max = Math.max(max, arr[i]);
            }

            int low = max;
            int high = sum;
            int ans = 0;

            while(low <= high){

                int mid = low + (high - low) / 2;

                if(isPossible(arr, mid, k)){

                    ans = mid;

                    high = mid - 1;

                }else{
                    low = mid + 1;
                }
            }

            return ans;
        }


        private static boolean isPossible(int[] arr, int mid, int k){

            int sum = 0;
            int student = 1;

            for(int i=0; i<arr.length; i++){
                sum += arr[i];

                if(sum > mid){
                    student++;
                    sum = arr[i];
                }
            }

            return student <= k;
        }
    }
}
