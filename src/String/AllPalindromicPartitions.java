package String;

import java.util.ArrayList;
import java.util.List;

public class AllPalindromicPartitions {
    class Solution {
        public ArrayList<ArrayList<String>> palinParts(String s) {
            // code   here

            ArrayList<ArrayList<String>> result = new ArrayList<>();
            backtrack(s, 0, new ArrayList<>(), result);
            return result;
        }

        private void backtrack(String s, int start, List<String> palin, ArrayList<ArrayList<String>> result){

            if(start == s.length()){
                result.add(new ArrayList<>(palin));
                return;
            }

            for(int end = start+1; end<=s.length(); end++){

                String subStr = s.substring(start, end);
                if(isPalindrom(subStr)){
                    palin.add(subStr);
                    backtrack(s, end, palin, result);
                    palin.remove(palin.size()-1);
                }
            }

        }

        private boolean isPalindrom(String s){
            int i = 0;
            int j = s.length()-1;
            while(i < j){
                if(s.charAt(i++) != s.charAt(j--)){
                    return false;
                }
            }
            return true;
        }

    }

}
