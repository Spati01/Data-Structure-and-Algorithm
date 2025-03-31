package Arrays;

import java.util.*;


public class PutMarblesInBags {


    class Solution {
        public long putMarbles(int[] weights, int k) {

            int n = weights.length;
            int[] pairs = new int[n-1];

            for(int i=0; i<n-1; i++){
                pairs[i] = weights[i] + weights[i+1];
            }

            Arrays.sort(pairs);
            long ans = 0;
            for(int i=0; i<k-1; i++){
                ans += pairs[n-1-1-i] - pairs[i];
            }

            return ans;
        }
    }
}
