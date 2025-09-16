package String;

import java.util.Stack;

public class PostfixEvaluation {


    class Solution {
        public int evaluatePostfix(String[] arr) {
            // code here

            Stack<Integer> stack = new Stack<>();

            for(String token : arr){
                if(isOperator(token)){

                    int b = stack.pop();
                    int a = stack.pop();
                    int result = applyOperation(a, b, token);
                    stack.push(result);

                }else stack.push(Integer.parseInt(token));
            }

            return stack.pop();
        }

        private boolean isOperator(String s){
            return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
        }

        private int applyOperation(int a, int b, String ops){
            switch(ops){
                case "+" : return a + b;
                case "-" : return a - b;
                case "*" : return a * b;
                case "/" :
                    if(a * b < 0 && a % b != 0)return (a/b)-1;
                    else return a / b;

                case "^" : return (int) Math.pow(a, b);
                default:
                    throw new IllegalArgumentException("Invalid Operator : " + ops);

            }
        }
    }
}
