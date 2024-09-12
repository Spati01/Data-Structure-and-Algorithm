package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SortEvenAndOddIndicesIndependently {

    class Solution {
        public int[] sortEvenOdd(int[] nums) {
            int n = nums.length;

            if(n < 3)return nums;

            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();

            int[] ans = new int[n];

            for(int i=0; i<n; i++){
                if(i % 2 == 0){
                    even.add(nums[i]);

                }else{
                    odd.add(nums[i]);
                }
            }

            Collections.sort(even);
            Collections.sort(odd);
            Collections.reverse(odd);

            int j = 0;
            int k = 0;
            for(int i=0; i<n; i++){
                if(i % 2 == 0){
                    ans[i] = even.get(j++);
                }else{
                    ans[i] = odd.get(k++);
                }


            }

            return ans;
        }
    }

}
