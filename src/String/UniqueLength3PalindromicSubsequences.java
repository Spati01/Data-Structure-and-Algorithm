package String;

import java.util.HashSet;

public class UniqueLength3PalindromicSubsequences {

    class Solution {
        public int countPalindromicSubsequence(String s) {

            int n = s.length();
            HashSet<Character> set = new HashSet<>();
            int count = 0;

            for(char ch : s.toCharArray()){
                set.add(ch);
            }

            for(char ch : set){
                int first = -1;
                int last = -1;

                for(int i=0; i<n; i++){
                    if(ch == s.charAt(i)){
                        if(first == -1){
                            first = i;
                        }
                        last = i;
                    }
                }
                if(first == last)continue;

                HashSet<Character> set1 = new HashSet<>();

                for(int i=first + 1; i<last; i++){
                    set1.add(s.charAt(i));
                }

                count += set1.size();
            }

            return count;
        }
    }


}
