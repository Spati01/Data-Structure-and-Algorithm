package String;

public class MakeStringASubsequenceUsingCyclicIncrements {

    class Solution {
        public boolean canMakeSubsequence(String str1, String str2) {
            int i = 0;
            int j = 0;

            while(i < str1.length() && j < str2.length()){

                int req = str2.charAt(j) - 'a';
                int cur = str1.charAt(i) - 'a';

                if(cur == req || req == (cur + 1) % 26){
                    j++;
                }
                i++;
            }
            return j == str2.length();

        }
    }



}
