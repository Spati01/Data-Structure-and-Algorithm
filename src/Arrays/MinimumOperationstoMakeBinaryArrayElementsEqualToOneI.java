package Arrays;

public class MinimumOperationstoMakeBinaryArrayElementsEqualToOneI {

    class Solution {
        public int minOperations(int[] nums) {

            int count = 0;

            for(int i=0; i<nums.length - 2; i++){
                if(nums[i] == 0){
                    flip(nums, i);
                    count++;
                }

            }


            for(int i=0; i<nums.length; i++){
                if(nums[i] == 0){
                    return -1;
                }
            }

            return count;
        }

        private static void flip(int[] nums, int st){
            for(int i=st; i<st+3; i++){
                if(nums[i] == 0){
                    nums[i] = 1;
                }else{
                    nums[i] = 0;
                }
            }
        }
    }
}
