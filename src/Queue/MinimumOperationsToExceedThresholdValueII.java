package Queue;

import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValueII {
    class Solution {
        public int minOperations(int[] nums, int k) {

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int num : nums){
                if(num < k) pq.add(num);
            }
            int operation = 0;
            while(!pq.isEmpty()){
                int x = pq.poll();
                operation++;
                if(pq.isEmpty())break;
                int y = pq.poll();
                long add = x * 2L + y;


                if(add < k) pq.add((int)add);

            }
            return operation;
        }
    }
}
