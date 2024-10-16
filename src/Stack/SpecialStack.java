package Stack;

import java.util.Stack;

public class SpecialStack {
    class GfG{
        public void push(int a,Stack<Integer> s)
        {
            //add code here.
            s.push(a);
        }
        public int pop(Stack<Integer> s)
        {
            //add code here.
            int val = 0;
            if(!s.isEmpty()){
                val =  s.pop();
            }
            return val;

        }
        public int min(Stack<Integer> s)
        {
            //add code here.
            int min =  Integer.MAX_VALUE;
            while(!s.isEmpty()){
                min = Math.min(min, s.pop());
            }
            return min;

        }
        public boolean isFull(Stack<Integer>s, int n)
        {
            //add code here.
            return s.size() == n ? true : false;
        }
        public boolean isEmpty(Stack<Integer>s)
        {
            //add code here.
            return s.size() == 0 ? true : false;
        }
    }
}
