package String;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeAfterSubstringConcatenationI {


    class Solution {
        public int longestPalindrome(String s, String t) {

            int max = 0;
            List<String> sSubs = subString(s);
            List<String> tSubs = subString(t);

            for(String sSub : sSubs){
                for(String tSub : tSubs){
                    String combine = sSub + tSub;
                    if(isPalindrome(combine)){
                        max = Math.max(max, combine.length());
                    }
                }
            }

            return max;

        }

        private  boolean isPalindrome(String s){
            int l = 0;
            int r = s.length() -1;
            while(l < r){
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }


        private static ArrayList<String> subString(String s){

            ArrayList<String> list = new ArrayList<>();

            for(int i=0; i<s.length(); i++){

                for(int j=i+1; j<=s.length(); j++){
                    list.add(s.substring(i, j));
                }


            }

            list.add("");
            return list;
        }
    }

}
