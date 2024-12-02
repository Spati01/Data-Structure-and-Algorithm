package String;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    class Solution {
        public int isPrefixOfWord(String sen, String searchWord) {

            String[] word = sen.split(" ");

            int searchLen = searchWord.length();
            int n = word.length;

            for(int i=0; i<n; i++){
                if(word[i].length() >= searchLen){
                    if(word[i].substring(0,searchLen).equals(searchWord)){
                        return i+1;
                    }
                }
            }
            return -1;
        }
    }


}
