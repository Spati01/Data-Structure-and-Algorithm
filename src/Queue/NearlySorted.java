package Queue;

import java.util.PriorityQueue;




public class NearlySorted {


    class Solution {
        // Non-static method, so you need to call it on an instance of the class
        public void nearlySorted(int[] arr, int k) {
            // code

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            int j = 0;
            minHeap.add(arr[0]);
            for(int i=1; i<arr.length; i++){

                if(minHeap.size() > k){
                    arr[j++] = minHeap.poll();
                }
                minHeap.add(arr[i]);
            }

            while(!minHeap.isEmpty()){
                arr[j++] = minHeap.poll();
            }
        }
    }
}
