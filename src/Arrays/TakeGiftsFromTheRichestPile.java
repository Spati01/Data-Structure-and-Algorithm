package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {

    class Solution0 {
        public long pickGifts(int[] gifts, int k) {
            int n = gifts.length;
            for(int i=0; i<k; i++){
                int idx = 0;
                int max = Integer.MIN_VALUE;

                for(int j=0; j<n; j++){

                    if(gifts[j] > max){
                        max = gifts[j];

                        idx = j;
                    }
                }


                gifts[idx] = (int) Math.sqrt(max);
            }

            long sum = 0;
            for(int i=0; i<n; i++){
                sum += gifts[i];
            }

            return sum;
        }
    }

    class Solution {
        public long pickGifts(int[] gifts, int k) {

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for(int  gift : gifts){
                pq.offer(gift);
            }


            while(!pq.isEmpty() && k > 0){
                pq.add((int) Math.sqrt(pq.poll()));
                k--;
            }

            long sum = 0;
            while(!pq.isEmpty()){
                sum += pq.poll();
            }

            return sum;

        }
    }

}
