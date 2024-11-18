package Arrays;

import java.util.HashMap;

public class NumberOfEquivalentDominoPairs {

    class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {

            HashMap<String, Integer> pairCountMap = new HashMap<>();
            int countPair = 0;
            for(int[] domino : dominoes){
                int a = domino[0];
                int b = domino[1];

                String pair = a < b ? a + "," + b : b + "," + a;

                if(pairCountMap.containsKey(pair)){
                    countPair += pairCountMap.get(pair);

                }
                pairCountMap.put(pair, pairCountMap.getOrDefault(pair, 0) + 1);
            }
            return countPair;
        }
    }
}
