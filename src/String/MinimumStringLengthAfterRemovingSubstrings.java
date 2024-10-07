package String;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {

    class Solution {
        public int minLength(String s) {
            int n = s.length();
            Stack<Character> stack = new Stack<>();
            stack.push(s.charAt(0));
            for(int i=1; i<n; i++){
                if(!stack.isEmpty() && ((s.charAt(i) == 'B'  && stack.peek() == 'A' ||  stack.peek() == 'C' && s.charAt(i) == 'D'))){

                    stack.pop();
                }else
                    stack.push(s.charAt(i));
            }
            return stack.size();
        }
    }


}
