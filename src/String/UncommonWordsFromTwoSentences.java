package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences {

    class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {

            HashMap<String,Integer> map = new HashMap<>();
            String[] str1 = s1.split(" ");
            String[] str2 = s2.split(" ");

            for(String word : str1){
                map.put(word,map.getOrDefault(word, 0)+1);
            }


            for(String word : str2){
                if(map.containsKey(word)){
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }else{
                    map.put(word,1);
                }
            }

            ArrayList<String> list = new ArrayList<>();
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(entry.getValue() == 1){
                    list.add(entry.getKey());
                }
            }
            return list.toArray(new String[0]);
        }
    }

}
