package String;

import java.util.HashMap;

public class SmallestWindowInAStringContainingAllTheCharactersOfAnotherString {

    class Solution
    {
        //Function to find the smallest window in the string s consisting
        //of all the characters of string p.
        public static String smallestWindow(String s, String p)
        {
            // Your code here
            if(s.length() == 0 || s.length() < p.length()) return "-1";
            HashMap<Character, Integer> map = new HashMap<>();

            for(char ch : p.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);

            }

            int count = 0;
            int min = Integer.MAX_VALUE;
            int left  = 0;
            int start = 0;

            for(int i=0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                    if(map.get(s.charAt(i)) >= 0)count++;
                }
                while(count == p.length()){
                    if(min > i - start + 1){
                        min = i - start + 1;
                        left = start;
                    }

                    if(map.containsKey(s.charAt(start))){
                        map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                        if(map.get(s.charAt(start)) > 0) count--;
                    }
                    start++;
                }
            }


            return  min > s.length() ? "-1" : s.substring(left, min + left);

        }
    }

}
