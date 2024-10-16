package String;

import java.util.HashSet;

public class CheckIfTwoStringArraysAreEquivalent {

    class SolutionHashSet {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            String s1 = "";
            for(String str : word1){
                for(int i=0; i<str.length(); i++){
                    s1 += str.charAt(i);
                }
            }

            HashSet<String> set = new HashSet<>();
            set.add(s1);

            String s2 = "";
            for(String str : word2){
                for(int i=0; i<str.length(); i++){
                    s2 += str.charAt(i);
                }
            }

            if(set.contains(s2)){
                return true;
            }
            return false;
        }
    }



    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            String s1 = "";
            for(String str : word1){
                for(int i=0; i<str.length(); i++){
                    s1 += str.charAt(i);
                }
            }

            String s2 = "";
            for(String str : word2){
                for(int i=0; i<str.length(); i++){
                    s2 += str.charAt(i);
                }
            }
            return s1.equals(s2);
        }
    }

}
