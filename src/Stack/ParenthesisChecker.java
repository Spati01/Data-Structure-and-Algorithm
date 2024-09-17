package Stack;

import java.util.Stack;

public class ParenthesisChecker {

    class Solution
    {
        //Function to check if brackets are balanced or not.
        static boolean ispar(String x)
        {
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<x.length(); i++){
                if(x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '['){
                    stack.push(x.charAt(i));
                } else{
                    if(stack.isEmpty())return false;
                    if(stack.peek() == '(' && x.charAt(i) == ')' ||
                            stack.peek() == '{' && x.charAt(i) == '}' ||
                            stack.peek() == '[' && x.charAt(i) == ']'
                    ) {

                        stack.pop();


                    }else{
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }

}
