package BitManipulation;

public class ShortestSubarrayWithORAtLeastKII {


    class Solution {

        public int minimumSubarrayLength(int[] nums, int k) {
            int n = nums.length;
            if(k == 0)return 1;
            return minmumLength(nums, n, k);
        }
        private int minmumLength(int[] nums, int n, int k){
            int min = Integer.MAX_VALUE;
            int orVal = 0;
            int[] bitCount = new int[32];
            int r = 0, l = 0;
            while(r < n){
                setBitCount(nums[r], bitCount);
                while(valueOf(bitCount)>= k){
                    min = Math.min(min, r - l + 1);
                    revertBit(nums[l++], bitCount);

                }
                r++;

            }
            return min == Integer.MAX_VALUE ? -1 : min;


        }

        private void setBitCount(int num, int[] bitCount){
            for(int i =31; i>=0 && num  > 0; i--){
                bitCount[i] += (int)(num & 1);
                num >>= 1;
            }
        }


        private void revertBit(int num,  int[] bitCount){
            for (int i = 31; i >= 0 && num > 0; i--) {
                bitCount[i] -= 1 == (int)(num & 1) ? 1 : 0;
                num = num >> 1;
            }
        }
        private int valueOf(int[] bitCount) {
            int prod = 0;
            for (int i = 0; i < bitCount.length; i++) {
                prod = prod * 2 + (bitCount[i] == 0 ? 0 : 1);
            }
            return prod;
        }

    }

}
