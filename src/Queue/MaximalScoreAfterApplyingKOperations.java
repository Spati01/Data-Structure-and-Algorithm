package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {

    class Solution {
        public long maxKelements(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int n = nums.length;
            for(int i : nums){
                pq.offer(i);
            }
            long score = 0;
            while(k > 0){
                int val = pq.poll();
                score += val;
                pq.offer((int)Math.ceil(val/3.0));
                k--;
            }
            return score;
        }
    }


}
