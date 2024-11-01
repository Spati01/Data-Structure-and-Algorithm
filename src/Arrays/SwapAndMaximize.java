package Arrays;

import java.util.*;

public class SwapAndMaximize {

    class Solution {
        public long maxSum(Long[] arr) {
            // code here
            int n = arr.length;
            long sum = 0;
            Arrays.sort(arr);
            for(int i=0; i<n; i++){

                sum += Math.abs(arr[i] - arr[n-i-1]);
            }

            return sum;
        }
    }
}
