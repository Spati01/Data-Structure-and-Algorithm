package String;

import java.util.HashSet;

public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {

    class Solution {
        public int maxUniqueSplit(String s) {

            return  Helper(s, new HashSet<>());
        }

        private int Helper(String s, HashSet<String> seen){
            int max = 0;

            for(int i=1; i<= s.length(); i++){
                String candid = s.substring(0, i);
                if(!seen.contains(candid)){
                    seen.add(candid);
                    max = Math.max(max, 1 + Helper(s.substring(i), seen));
                    seen.remove(candid);
                }
            }
            return max;
        }
    }

}
