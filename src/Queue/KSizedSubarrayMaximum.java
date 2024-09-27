package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class KSizedSubarrayMaximum {


    class Solution {
        // Function to find maximum of each subarray of size k.
        public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
            // Your code here
            ArrayList<Integer> list = new ArrayList<>();
            Deque<Integer> dq = new LinkedList<>();

            for(int i=0; i<arr.length; i++){

                if(!dq.isEmpty() && dq.peek() < i - k + 1){
                    dq.poll();
                }
                while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                    dq.pollLast();
                }
                dq.offer(i);


                if(i >= k -1){
                    list.add(arr[dq.peek()]);
                }
            }

            return list;
        }
    }


}
