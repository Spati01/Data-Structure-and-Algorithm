package Arrays;

import java.util.PriorityQueue;
import java.util.*;

public class DivideIntervalsIntoMinimumNumberOfGroups {
    class Solution {
        public int minGroups(int[][] inter) {
            Arrays.sort(inter, (a, b)-> a[0] - b[0]);
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int[] in : inter){
                int start = in[0];
                int end = in[1];
                if(!pq.isEmpty() && pq.peek() < start){
                    pq.poll();
                }
                pq.add(end);
            }
            return pq.size();
        }
    }


}
