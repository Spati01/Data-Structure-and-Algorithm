package Arrays;

public class MakeArrayElementsEqualToZero {

    class Solution {
        int n;
        private boolean Selections(int[] nums, int start, int direction){
            n = nums.length;
            int curr = start;
            int[] temp = nums.clone();
            while(curr >= 0 && curr < n){
                if(temp[curr] == 0){
                    curr += direction;
                }else{
                    temp[curr] -= 1;
                    direction *= -1;
                    curr += direction;
                }
            }

            for(int num : temp){
                if(num != 0){
                    return false;
                }
            }
            return true;
        }
        public int countValidSelections(int[] nums) {

            n = nums.length;
            int count = 0;
            for(int i=0; i<n; i++){
                if(nums[i] == 0){
                    if(Selections(nums, i, -1)){
                        count++;
                    }

                    if(Selections(nums, i, 1)){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
