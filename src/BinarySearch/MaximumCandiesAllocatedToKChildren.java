package BinarySearch;

import java.util.*;

public class MaximumCandiesAllocatedToKChildren {

    class Solution {
        public int maximumCandies(int[] candies, long k) {

            int maxCandieInPile = Arrays.stream(candies).max().orElse(0);


            int left = 0;
            int right = maxCandieInPile;

            while(left < right){
                int mid  = (left + right + 1) / 2;
                if(canAllocateCandies(candies, k, mid)){
                    left = mid;
                }else{
                    right = mid - 1;
                }
            }
            return left;
        }
        private boolean canAllocateCandies(int[] candies, long k, int noOfCandies){

            long noOfChild = 0;
            for(int i=0; i<candies.length; i++){
                noOfChild += candies[i] / noOfCandies;
            }

            return noOfChild >= k;
        }

    }


}
