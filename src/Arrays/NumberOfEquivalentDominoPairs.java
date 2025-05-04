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
    class Helper {
        public int numEquivDominoPairs(int[][] dominoes) {

            int count = 0;
            int[] freq = new int[100];

            for (int[] d : dominoes) {
                int a = Math.min(d[0], d[1]);
                int b = Math.max(d[0], d[1]);
                int key = a * 10 + b;

                count+=freq[key]++;
            }


            return count;
        }
    }


    class Solver {
        public int numEquivDominoPairs(int[][] dominoes) {

            int count = 0;
            HashMap<String, Integer> map = new HashMap<>();

            for (int[] d : dominoes) {
                int a = Math.min(d[0], d[1]);
                int b = Math.max(d[0], d[1]);
                String key = a + "," + b;

                count += map.getOrDefault(key, 0);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }


            return count;
        }
    }
}
