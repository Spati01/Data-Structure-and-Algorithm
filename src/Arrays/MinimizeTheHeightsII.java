package Arrays;

import java.util.*;

public class MinimizeTheHeightsII {


    class Solution {
        int getMinDiff(int[] arr, int k) {
            // code here
            int n = arr.length;
            if(n==1)return 0;
            Arrays.sort(arr);

            int minDiff = arr[n-1] - arr[0];

            int sm = arr[0] + k;
            int lo = arr[n-1] - k;

            for(int i=1; i<n; i++){
                if(arr[i] - k < 0)continue;
                int high = Math.max(arr[i-1]+k, lo);
                int low = Math.min(arr[i]-k, sm);


                minDiff = Math.min(minDiff, high - low);
            }
            return minDiff;

        }
    }




}
