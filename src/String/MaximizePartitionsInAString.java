package String;

import java.util.HashMap;

public class MaximizePartitionsInAString {

    class Solution {
        public int maxPartitions(String s) {
            // code here

            HashMap<Character, Integer> map = new HashMap<>();

            for(int i=0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), i);
                }else{
                    map.put(s.charAt(i), i);
                }
            }

            int partitions  = 0;
            int max = 0;

            for(int i=0; i<s.length(); i++){
                max = Math.max(max, map.get(s.charAt(i)));

                if(i == max){
                    partitions++;
                }
            }

            return partitions;
        }
    }
}
