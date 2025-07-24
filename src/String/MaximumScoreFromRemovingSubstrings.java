package String;

import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings {

    class Solution {
        public int maximumGain(String s, int x, int y) {

            if(x < y){
                return gain(s, x, y, 'a', 'b');
            }else{
                return gain(s, y, x, 'b', 'a');
            }
        }


        private int gain(String s, int x, int y, char a, char b){


            Stack<Character> stack = new Stack<>();

            int gain = 0;


            for(int i=0; i<s.length(); i++){
                if(!stack.isEmpty() && stack.peek() == b && s.charAt(i) == a){
                    gain += y;
                    stack.pop();

                }else{

                    stack.push(s.charAt(i));
                }
            }
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty())
                sb.append(stack.pop());

            stack = new Stack<>();

            for(int i=0; i<sb.length(); i++){
                if(!stack.isEmpty() && sb.charAt(i) == a && stack.peek() == b){
                    gain +=x;
                    stack.pop();
                }else{
                    stack.push(sb.charAt(i));
                }
            }

            return gain;
        }
    }
}
