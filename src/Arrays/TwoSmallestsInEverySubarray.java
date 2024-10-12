package Arrays;

public class TwoSmallestsInEverySubarray {


    class Solution {
        public int pairWithMaxSum(int[] arr) {
            // code here
            if(arr.length == 1)return -1;
            int max = Integer.MIN_VALUE;
            for(int i=1; i<arr.length; i++){
                max = Math.max(max, arr[i - 1] + arr[i]);
            }
            return max;
        }
    }

}
