package Arrays;

import java.util.Deque;
import java.util.LinkedList;

public class ShortestSubarrayWithSumAtLeastK {


    class Solution {
        public int shortestSubarray(int[] nums, int k) {
            int n = nums.length;

            long[] ans = new long[n+1];
            for(int i=0; i<n; i++){
                ans[i+1] = ans[i] + nums[i];
            }

            int min = n + 1;
            Deque<Integer> dq = new LinkedList<>();

            for(int i=0; i<=n; i++){
                while(!dq.isEmpty() && ans[i] <= ans[dq.getLast()]){
                    dq.removeLast();
                }
                while(!dq.isEmpty() && ans[i] - ans[dq.getFirst()] >= k){
                    min = Math.min(min, i-dq.removeFirst());
                }
                dq.addLast(i);
            }
            return min <= n ? min : -1;

        }
    }
}
