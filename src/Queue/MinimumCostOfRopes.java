package Queue;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
    class Solution
    {
        //Function to return the minimum cost of connecting the ropes.
        long minCost(long arr[], int n)
        {
            // your code here
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for(int i=0; i<n; i++){
                pq.add(arr[i]);
            }
            long cost = 0;

            while(pq.size() > 1){
                long f = pq.remove();
                long s =  pq.remove();
                cost += f + s;
                pq.offer(f + s);

            }
            return cost;
        }
    }



}
