package HashMapHashSet;

import java.util.HashMap;

public class NonRepeatingCharacter {


    class Solution {
        // Function to find the first non-repeating character in a string.
        static char nonRepeatingChar(String s) {
            // Your code here

            HashMap<Character, Integer> map = new HashMap<>();

            for(char ch : s.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }


            for(char ch : s.toCharArray()){
                if(map.get(ch) == 1){
                    return ch;
                }
            }
            return '$';
        }
    }

}
