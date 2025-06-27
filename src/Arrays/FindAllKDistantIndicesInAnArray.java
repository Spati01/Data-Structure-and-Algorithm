package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesInAnArray {

    class Solution {
        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

            int n = nums.length;

            boolean[] isDistant = new boolean[n];

            for(int i=0; i<n; i++){
                if(nums[i] == key){
                    int start = Math.max(0, i-k);
                    int end = Math.min(n-1, i+k);

                    for(int j=start; j<=end; j++){
                        isDistant[j] = true;
                    }
                }
            }


            List<Integer> list = new ArrayList<>();

            for(int i=0; i<n; i++){
                if(isDistant[i]){
                    list.add(i);
                }
            }

            return list;
        }
    }
}
