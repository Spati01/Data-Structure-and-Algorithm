package Arrays;

public class ApplyOperationsToAnArray {

    class Solution {
        public int[] applyOperations(int[] nums) {
            int n = nums.length-1;
            for(int i=0; i<n; i++){
                if(nums[i] == nums[i+1]){
                    nums[i] = nums[i] * 2;
                    nums[i+1] = 0;
                }else{
                    nums[i] = nums[i];

                }
            }

            return shifting(nums);
        }

        private int[] shifting(int[] arr){
            int index = 0;
            for(int num : arr){
                if(num != 0){
                    arr[index++] = num;
                }
            }

            while(index < arr.length){
                arr[index++] = 0;
            }

            return arr;
        }
    }


}
