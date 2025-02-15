package Stack;

import java.util.Stack;

public class AsteroidCollision {

    class Solution {
        public int[] asteroidCollision(int[] ast) {
            int n = ast.length;
            Stack<Integer> stack = new Stack<>();

            for(int i=0; i<n; i++){
                if(stack.isEmpty() || ast[i] > 0){
                    stack.push(ast[i]);
                }else{

                    while(!stack.isEmpty()){
                        int top = stack.peek();
                        if(top < 0){
                            stack.push(ast[i]);
                            break;
                        }

                        int abso = Math.abs(ast[i]);
                        if(abso == top){
                            stack.pop();
                            break;
                        }else if(abso < top){
                            break;
                        }else{
                            stack.pop();
                            if(stack.isEmpty()){
                                stack.push(ast[i]);
                                break;
                            }
                        }


                    }
                }
            }

            int[] collision = new int[stack.size()];
            for(int i=stack.size() - 1; i>= 0; i--){
                collision[i] = stack.pop();
            }
            return collision;

        }
    }
}
