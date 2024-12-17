package Arrays;

public class MaximizeNumberOf1s {



    class Solution {
        // k is the maximum number of zeros allowed to flip
        public int maxOnes(int arr[], int k) {
            // code here

            int n = arr.length;

            if(n == k)return n;

            int l = 0, zeroCount = 0;
            int maxLength = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){

                if(arr[i] == 0)zeroCount++;

                while(arr[i] == 0 && zeroCount > k){
                    if(arr[l++] == 0) zeroCount--;
                }

                if(zeroCount <= k) maxLength = Math.max(maxLength, i-l+1);
            }

            return maxLength;
        }
    }
}
