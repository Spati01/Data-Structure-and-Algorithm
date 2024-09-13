package Arrays;

import java.util.HashMap;

public class ReplaceElementsInAnArray {
    class Solution {
        public int[] arrayChange(int[] nums, int[][] op) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                map.put(nums[i],i);
            }
            for(int i=0; i<op.length; i++){

                int index = map.get(op[i][0]);
                nums[index] = op[i][1];

                map.remove(op[i][0]);
                map.put(nums[index],index);

            }

            return nums;
        }
    }




}
