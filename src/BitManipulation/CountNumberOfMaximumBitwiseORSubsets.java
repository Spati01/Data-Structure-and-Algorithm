package BitManipulation;

public class CountNumberOfMaximumBitwiseORSubsets {

    class Solution {

        int count;
        int max;

        public int countMaxOrSubsets(int[] nums) {
            count = 0;
            max = 0;
            Helper(nums, 0 , 0);
            return count;
        }
        private void Helper(int[] nums,int curIdx, int curValue){

            if(curIdx >= nums.length){
                if(curValue > max){
                    count = 1;
                    max = curValue;
                }
                else if(curValue == max){
                    count++;
                }
                return;

            }
            Helper(nums, curIdx + 1, curValue | nums[curIdx]);
            Helper(nums, curIdx + 1, curValue);

        }
    }



}
