package Arrays;

public class MinimumOperationsToReduceXToZero {

    public int minOperations(int[] nums, int x) {
        int target = -x;
        for(int  i : nums) target += i;
        if(target == 0)return nums.length;
        if(target < 0) return -1;

        int sum = 0, res = -1, left = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum > target){
                sum -= nums[left++];
            }

            if( sum == target){
                res = Math.max(res,i-left+1);
            }
        }
        return res == -1 ? -1 : nums.length - res;
    }
}
