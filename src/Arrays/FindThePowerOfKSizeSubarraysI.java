package Arrays;

public class FindThePowerOfKSizeSubarraysI {

    class Solution {
        public int[] resultsArray(int[] nums, int k) {
            int n = nums.length;
            if(k > n) return new int[0];
            int[]  result = new int[n-k+1];
            for(int i=0; i<= n-k; i++){
                int[] subArray = new int[k];
                System.arraycopy(nums, i, subArray, 0, k);

                if(checkConsecutive(subArray)){
                    int max = getMax(subArray);
                    result[i] = max;
                }else{
                    result[i] = -1;
                }
            }
            return result;

        }
        private boolean checkConsecutive(int[] arr){

            for(int i=1; i<arr.length; i++){
                if(arr[i] != arr[i-1] + 1){
                    return false;
                }
            }
            return true;
        }
        private int getMax(int[] arr){
            int max = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
