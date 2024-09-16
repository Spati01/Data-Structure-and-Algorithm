package String;

import java.util.Stack;

public class LongestValidParentheses {

    class Solution{
        static int maxLength(String S){
            // code here
            Stack<Integer> stack = new Stack<>();

            stack.push(-1);
            int maxLen = 0;
            for(int i=0; i<S.length(); i++){
                char ch = S.charAt(i);
                if(ch == '('){
                    stack.push(i);
                }else if(ch == ')'){
                    if(!stack.isEmpty()){
                        stack.pop();

                        if(stack.isEmpty()){
                            stack.push(i);
                        }else{
                            maxLen = Math.max(maxLen, i - stack.peek());
                        }

                    }
                }
            }
            return maxLen;
        }
    }



}
