package Stack;

import java.util.Stack;

public class DesignAStackWithIncrementOperation {


    class CustomStack {
        Stack<Integer> stack;
        int size;

        public CustomStack(int maxSize) {
            this.size = maxSize;
            this.stack = new Stack<>();
        }

        public void push(int x) {
            if(stack.size() < size){
                stack.push(x);
            }

        }

        public int pop() {
            if(stack.size() > 0){
                return stack.pop();
            }else{
                return -1;
            }
        }

        public void increment(int k, int val) {

            Stack<Integer> s1 = new Stack<>();
            while(!stack.isEmpty()){
                s1.push(stack.pop());
            }

            for(int i=0; i<k; i++){
                if(s1.size() == 0){
                    break;
                }
                stack.push(s1.pop() + val);
            }
            while(s1.size() != 0){
                stack.push(s1.pop());
            }
        }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
}
