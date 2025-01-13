package String;

import java.util.HashMap;

public class MinimumLengthOfStringAfterOperations {

    class Solution {
        public int minimumLength(String s) {

            HashMap<Character, Integer> map = new HashMap<>();

            for(char ch : s.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            int len = 0;

            for(int freq : map.values()){
                if(freq % 2 == 1){
                    len += freq - 1;
                }else{
                    len += freq - 2;
                }


            }
            return s.length() - len;
        }
    }
}
