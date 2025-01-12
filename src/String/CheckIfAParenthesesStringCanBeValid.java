package String;

import java.util.Stack;

public class CheckIfAParenthesesStringCanBeValid {

    class Solution {
        public boolean canBeValid(String s, String locked) {

            int n = s.length();
            Stack<Integer> str = new Stack<>();
            Stack<Integer> unlocked = new Stack<>();

            if(n % 2 != 0)return false;

            for(int i=0; i<n; i++){
                char ch = s.charAt(i);
                char state = locked.charAt(i);

                if(state == '0'){
                    unlocked.push(i);
                }else if(ch == '('){
                    str.push(i);
                }else{

                    if(!str.isEmpty()){
                        str.pop();
                    }else{

                        if(!unlocked.isEmpty()){
                            unlocked.pop();
                        }else{
                            return false;
                        }

                    }
                }
            }

            while(!str.isEmpty() && !unlocked.isEmpty() && str.peek() < unlocked.peek()){
                str.pop();
                unlocked.pop();
            }


            return str.isEmpty();
        }
    }


}
