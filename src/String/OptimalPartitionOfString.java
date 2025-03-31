package String;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString {

    class Solution {
        public int partitionString(String s) {
            int n = s.length();
            Set<Character> seen = new HashSet<>();

            int partition = 1;

            for(char ch : s.toCharArray()){
                if(seen.contains(ch)){
                    partition++;
                    seen.clear();
                }
                seen.add(ch);
            }

            return partition;
        }
    }
}
