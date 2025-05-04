package String;

import java.util.HashSet;

public class SmallestDistinctWindow {

    class Solution {
        public int findSubString(String str) {
            // code here

            HashSet<Character> unique = new HashSet<>();
            for(char ch : str.toCharArray()){
                unique.add(ch);
            }

            int totalUnique = unique.size();

            int start = 0;
            int count=0;
            int minWindow = Integer.MAX_VALUE;
            int[] freq = new int[256];



            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                freq[ch]++;
                if(freq[ch] == 1)count++;


                while(count == totalUnique){
                    int window = i - start + 1;
                    minWindow = Math.min(minWindow, window);


                    freq[str.charAt(start)]--;
                    if(freq[str.charAt(start)] == 0)count--;
                    start++;
                }
            }

            return minWindow;

        }
    }

}
