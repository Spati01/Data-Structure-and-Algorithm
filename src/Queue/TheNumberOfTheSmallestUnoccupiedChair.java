package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class TheNumberOfTheSmallestUnoccupiedChair {
    class Solution {
        public int smallestChair(int[][] times, int targetFriend) {
            int targetArrival = times[targetFriend][0];
            Arrays.sort(times, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[0] - b[0];
                }
            });

            PriorityQueue<int[]> occupied = new PriorityQueue<>(new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[0] - b[0];
                }
            });

            PriorityQueue<Integer> available = new PriorityQueue<>();
            int chairNo = 0;
            for(int[] time : times){
                int arrival = time[0];
                int leaving = time[1];
                while(!occupied.isEmpty() && occupied.peek()[0] <= arrival){
                    available.offer(occupied.poll()[1]);
                }

                int currentChairNo;
                if(available.isEmpty()){
                    currentChairNo = chairNo;
                    chairNo++;
                }else{
                    currentChairNo = available.poll();

                }
                if(targetArrival == arrival)return currentChairNo;
                occupied.offer(new int[]{leaving, currentChairNo});

            }

            return -1;
        }
    }


}
