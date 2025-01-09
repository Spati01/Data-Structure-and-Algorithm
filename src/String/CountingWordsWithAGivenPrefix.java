package String;

public class CountingWordsWithAGivenPrefix {

    class Solution {
        public int prefixCount(String[] words, String pref) {
            int count = 0;
            for(String word : words){
                if(isPrefix(word, pref)){
                    count++;
                }
            }

            return count;
        }
        private boolean isPrefix(String word, String pre){

            return word.startsWith(pre);
        }
    }
}
