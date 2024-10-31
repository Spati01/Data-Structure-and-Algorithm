package String;

import java.util.ArrayList;

public class KeyboardRow {

    class Solution {
        public String[] findWords(String[] words) {

            String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
            ArrayList<String> list = new ArrayList<>();
            for(String word : words){
                if(isPresent(rows, word.toLowerCase())){
                    list.add(word);
                }
            }
            return list.toArray(new String[0]);
        }
        private boolean isPresent(String[] rows, String word){
            for(String row : rows){
                if(row.indexOf(word.charAt(0)) >= 0){
                    for(char ch : word.toCharArray()){
                        if(row.indexOf(ch) < 0){
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
