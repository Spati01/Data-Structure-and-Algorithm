package Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for(int i=0; i<k; i++){
            int idx = 0;
            for(int j=0; j<n; j++){
                if(nums[j] < nums[idx]){
                    idx = j;
                }
            }
            nums[idx] *=  multiplier;

        }

        return nums;
    }
}
