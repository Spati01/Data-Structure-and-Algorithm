package BitManipulation;

public class MaximumXORForEachQuery {

    class Solution {
        public int[] getMaximumXor(int[] nums, int maximumBit) {

            int n = nums.length;
            int[] prefixXor = new int[n];
            prefixXor[0] = nums[0];
            for(int i=1; i<n; i++){
                prefixXor[i] = prefixXor[i-1] ^ nums[i];
            }

            int maxXor = (1 << maximumBit) - 1;

            int[] ans = new int[n];
            for(int i=0; i<n; i++){
                ans[i] = prefixXor[n-i-1] ^ maxXor;
            }

            return ans;
        }
    }
}
