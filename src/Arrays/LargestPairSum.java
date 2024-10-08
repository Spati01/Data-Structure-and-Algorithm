package Arrays;

public class LargestPairSum {



    class Solution {
        public static int pairsum(int[] arr) {
            // code here
            int max = 0;
            int secMax = 0;
            for(int i  : arr) max = Math.max(max, i);
            for(int i : arr) if(i < max) secMax = Math.max(secMax, i);
            return max + secMax;
        }
    }

}
