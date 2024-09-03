package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KThNearestObstacleQueries {

    public int[] resultsArray(int[][] queries, int k) {
        int[] ans = new int[queries.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<queries.length; i++){
            pq.add(Math.abs(queries[i][0]) + Math.abs(queries[i][1]));

            if(pq.size() < k){
                ans[i] = -1;
            }

            else if(pq.size() == k){
                ans[i] = pq.peek();
            }else {
                pq.poll();
                ans[i] = pq.peek();
            }
        }
        return ans;
    }
}
