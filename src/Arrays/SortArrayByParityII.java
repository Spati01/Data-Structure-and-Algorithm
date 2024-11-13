package Arrays;

public class SortArrayByParityII {
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            int evenIndex = 0;
            int oddIndex = 1;
            int[] ans = new int[nums.length];
            for(int num : nums){
                if(num % 2 == 0){
                    ans[evenIndex] = num;
                    evenIndex += 2;
                }else{
                    ans[oddIndex] = num;
                    oddIndex += 2;

                }
            }
            return ans;
        }
    }
}
