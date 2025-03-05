package HashMapHashSet;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class LongestStringChain {


    class Solution {
        public int longestStringChain(String words[]) {
            // code here
            Arrays.sort(words, (a,b)-> a.length() - b.length());

            Map<String,Integer> map = new HashMap<>();
            int maxLength = 1;

            for(String word : words){
                int best = 1;
                for(int i=0; i<word.length(); i++){
                    String predecessor = word.substring(0, i) + word.substring(i + 1);

                    best  = Math.max(best, map.getOrDefault(predecessor , 0) + 1);
                }
                map.put(word, best);
                maxLength = Math.max(maxLength, best);
            }

            return maxLength;
        }
    }
}
