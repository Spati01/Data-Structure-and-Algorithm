package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArithmeticSubarrays {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = nums.length;
        int m = l.length;
        List<Boolean> result = new ArrayList<>();

        for(int i=0; i<m; i++){
            int left = l[i];
            int right = r[i];
            List<Integer> subarray = new ArrayList<>();
            for(int j=left; j<=right; j++){
                subarray.add(nums[j]);
            }

            result.add(isArithmetic(subarray));
        }
        return result;

    }
    private boolean isArithmetic(List<Integer> list){
        int len = list.size();

        if(len <= 1)return true;
        Collections.sort(list);

        int diff = list.get(1) - list.get(0);
        for(int i=2; i<len; i++){
            if(list.get(i) - list.get(i-1) != diff){
                return false;
            }
        }
        return true;
    }
}
