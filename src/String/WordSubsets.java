package String;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {

    class Solution {
        public List<String> wordSubsets(String[] words1, String[] words2) {

            List<String> list = new ArrayList<>();

            int[] temp = new int[26];

            for(String word2 : words2){
                int[] target = new int[26];

                for(char c : word2.toCharArray()){
                    target[c - 'a']++;
                    temp[c - 'a'] = Math.max(temp[c - 'a'] , target[c - 'a']);
                }
            }

            for(String word1 : words1){
                int[] target = new int[26];
                for(char c : word1.toCharArray()) target[c - 'a']++;
                if(isSubset(target, temp)){
                    list.add(word1);

                }
            }

            return list;
        }


        private boolean isSubset(int[] target, int[] temp){
            for(int i=0; i<26; i++){
                if(target[i] < temp[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
