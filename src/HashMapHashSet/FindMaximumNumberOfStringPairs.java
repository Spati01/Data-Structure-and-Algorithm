package HashMapHashSet;

import java.util.HashSet;

public class FindMaximumNumberOfStringPairs {

    class Solution {
        public int maximumNumberOfStringPairs(String[] words) {

            HashSet<String> set = new HashSet<>();
            int count = 0;
            for(int i=0; i<words.length; i++){
                if(set.contains(reverse(words[i]))){
                    count++;
                    set.remove(words[i]);
                }else{
                    set.add(words[i]);
                }

            }
            return count;

        }



        private String reverse(String str){
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }
    }
}
