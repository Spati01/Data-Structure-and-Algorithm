package Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    class Solution {
        public int[] topKFrequent(int[] nums, int k) {

            Map<Integer, Integer> map = new HashMap<>();
            for(int num : nums){
                map.put(num,map.getOrDefault(num, 0) +1);
            }
            PriorityQueue<Map.Entry<Integer,Integer>> maxHeap =
                    new PriorityQueue<>((a, b)-> (b.getValue() - a.getValue()));

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                maxHeap.add(entry);
            }

            int[] ans = new int[k];
            for(int i=0; i<k; i++){
                Map.Entry<Integer,Integer> entry = maxHeap.poll();
                ans[i] = entry.getKey();
            }



            return ans;
        }
    }
}
