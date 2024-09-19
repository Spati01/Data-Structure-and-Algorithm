package String;

import java.util.ArrayList;

public class ReverseWords {


    class Solution {
        // Function to reverse words in a given string.
        String reverseWords(String s) {
            // code here
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);

            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '.'){
                    list.add(i);
                }
            }
            list.add(s.length());

            String answer = "";
            for(int i=list.size() - 2; i>0; i--){
                answer+=s.substring(list.get(i) + 1, list.get(i+1));
                answer+=".";
            }
            answer+=s.substring(list.get(0), list.get(1));

            return answer;

        }
    }
}
