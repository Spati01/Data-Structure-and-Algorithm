package HashMapHashSet;

import java.util.HashMap;

public class hortestCompletingWord {

    class Solution {
        public String shortestCompletingWord(String licensePlate, String[] words) {
            String plate = CleanLincensePlate(licensePlate);
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : plate.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            String ans = "";
            for(String word : words){
                HashMap<Character, Integer> wordMap = new HashMap<>();
                for(char ch : word.toCharArray()){
                    wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
                }
                boolean valid = true;
                for(char ch : map.keySet()){
                    if(wordMap.getOrDefault(ch, 0) < map.get(ch)){
                        valid = false;
                        break;
                    }
                }

                if(valid && (ans.isEmpty() || word.length() < ans.length())){
                    ans = word;
                }

            }


            return ans;

        }
        private String CleanLincensePlate(String lincense){
            StringBuilder sb = new StringBuilder();
            for(char ch : lincense.toCharArray()){
                if(Character.isLetter(ch)){
                    sb.append(Character.toLowerCase(ch));
                }
            }
            return sb.toString();
        }
    }
}
