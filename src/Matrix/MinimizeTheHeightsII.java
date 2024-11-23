package Matrix;

import java.util.*;

public class MinimizeTheHeightsII {


    class Solution {
        int getMinDiff(int[] arr, int k) {
            // code here

            int n = arr.length;
            if(n == 0)return 0;

            Arrays.sort(arr);

            int diff = arr[n-1] - arr[0];

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i=1; i<n; i++){
                if(arr[i] - k < 0)continue;

                max = Math.max(arr[i-1] + k, arr[n-1] -k);
                min = Math.min(arr[0] + k, arr[i] - k);

                diff = Math.min(diff, max - min);
            }
            return diff;
        }
    }

}
