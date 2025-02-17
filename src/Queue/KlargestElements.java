package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KlargestElements {

    class Solution {
        public ArrayList<Integer> kLargest(int[] arr, int k) {
            // Your code here
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            ArrayList<Integer> list = new ArrayList<>();

            for(int i : arr){
                pq.offer(i);
            }

            while(!pq.isEmpty() && k != 0){
                list.add(pq.poll());
                k--;
            }

            return list;

        }
    }


}
