package Arrays;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class SumPairClosestToTarget {


    class Solution {
        public List<Integer> sumClosest(int[] arr, int target) {
            // code here

            if(arr.length < 2 || arr == null)return new ArrayList<>();

            int n = arr.length;
            Arrays.sort(arr);
            int[] close = new int[2];
            int left = 0;
            int right = n-1;
            int closestSum = Integer.MAX_VALUE;
            int closestDiff = Integer.MAX_VALUE;

            while(left < right){
                int sum = arr[left] + arr[right];

                if(sum == target){
                    return Arrays.asList(arr[left], arr[right]);

                }
                int diff = Math.abs(sum - target);

                if(diff < closestDiff){
                    closestDiff = diff;
                    closestSum = sum;
                    close[0] = arr[left];
                    close[1] = arr[right];

                }

                if(sum < target){
                    left++;
                }else{
                    right--;
                }



            }



            return Arrays.asList(close[0], close[1]);

        }
    }
}
