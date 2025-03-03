package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class LongestBoundedDifferenceSubarray {



    class Solution {

        public ArrayList<Integer> longestSubarray(int[] arr, int x) {
            // code here
            Deque<Integer> max = new LinkedList<>();
            Deque<Integer> min = new LinkedList<>();

            int str = 0, maxLen = 0, ansStr = 0;

            for(int end=0; end<arr.length; end++){
                while(!max.isEmpty() && arr[max.peekLast()] <= arr[end]){
                    max.pollLast();
                }
                max.addLast(end);

                while(!min.isEmpty() && arr[min.peekLast()] >= arr[end]){
                    min.pollLast();
                }
                min.addLast(end);

                while(arr[max.peekFirst()] - arr[min.peekFirst()] > x){
                    str++;
                    if(max.peekFirst() < str)max.pollFirst();
                    if(min.peekFirst() < str)min.pollFirst();

                }

                if(end - str + 1 > maxLen){
                    maxLen = end - str + 1;
                    ansStr = str;
                }

            }

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=ansStr; i<ansStr + maxLen; i++){
                list.add(arr[i]);
            }

            return list;
        }
    }
}
