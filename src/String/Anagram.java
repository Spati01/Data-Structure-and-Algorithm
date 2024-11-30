package String;

import java.util.*;


public class Anagram {


    class Solution {
        // Function is to check whether two strings are anagram of each other or not.
        public static boolean areAnagrams(String s1, String s2) {

            // Your code here
            if(s1.length() != s2.length()) return false;

            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);
        }
    }
}
