package Arrays;


import java.util.*;


public class MinimizeTheHeightsI {

    class Solution {
        public int getMinDiff(int k, int[] arr) {
            // code here
            int n = arr.length;
            Arrays.sort(arr);
            int mini,maxi;

            int min = arr[0];
            int max = arr[n-1];
            int diff = max - min;

            for(int i=0; i<n-1; i++){
                mini = Math.min(min + k, arr[i+1] - k);
                maxi = Math.max(max - k, arr[i] + k);
                diff = Math.min(diff, maxi - mini);
            }
            return diff;
        }
    }
}
