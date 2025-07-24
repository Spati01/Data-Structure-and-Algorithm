package Arrays;

public class SumOfSubarrays {
    class Solution {
        public int subarraySum(int[] arr) {
            // code here
            int totalSum = 0;
            int n = arr.length;
            for(int i=0; i<n; i++){
                int occ = (i + 1) * (n - i);

                totalSum += occ * arr[i];
            }

            return totalSum;
        }
    }

}
