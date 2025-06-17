package BinarySearch;

import java.util.*;

public class CoinPiles {


    class Solution {
        public int minimumCoins(int[] arr, int k) {
            // code here

            int n = arr.length;

            Arrays.sort(arr);

            int[] prefix = prefixSum(arr, n);

            int min_piles = Integer.MAX_VALUE;
            int prev = 0;

            for(int i=0; i<n; i++){

                int idx = upperBound(arr, i, n, arr[i] + k);

                if(i > 0){
                    prev = prefix[i-1];
                }

                int totalToRemove = prev + prefix[n-1] - prefix[idx-1] - (arr[i] + k) * (n-idx);

                min_piles = Math.min(min_piles, totalToRemove);
            }


            return min_piles;
        }
        private int upperBound(int[] arr, int start, int end, int target){

            int low = start, high = end;

            while(low < high){
                int mid = low + (high - low) / 2;

                if(arr[mid] <= target){
                    low = mid + 1;
                }else{
                    high = mid;
                }
            }

            return low;
        }

        private int[] prefixSum(int[] arr, int n){

            int[] prefix = new int[n];
            prefix[0] = arr[0];

            for(int i=1; i<n; i++){
                prefix[i] = prefix[i-1] + arr[i];
            }
            return prefix;
        }
    }

}
