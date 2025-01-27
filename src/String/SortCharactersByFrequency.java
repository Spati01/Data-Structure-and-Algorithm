package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {

    class Solution {
        public String frequencySort(String s) {

            HashMap<Character, Integer> myMap = new HashMap<>();
            StringBuilder sb = new StringBuilder();

            for(char ch : s.toCharArray()){
                myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
            }
            List<Character> entry = new ArrayList<>(myMap.keySet());
            entry.sort((a, b) -> myMap.get(b) - myMap.get(a));

            for(char ch : entry){
                for(int i=myMap.get(ch); i>0; i--){
                    sb.append(ch);
                }
            }

            return sb.toString();


        }
    }
}
