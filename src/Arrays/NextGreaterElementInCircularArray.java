package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElementInCircularArray {

    class Solution {
        public ArrayList<Integer> nextLargerElement(int[] arr) {
            // code here
            ArrayList<Integer> list = new ArrayList<>();
            Stack<Integer> st = new Stack<>();

            int n = arr.length;

            for(int i=n-2; i>=0; i--){
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
                st.push(arr[i]);
            }


            for(int i=n-1; i>=0; i--){
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }

                if(!st.isEmpty()) list.add(st.peek());
                else list.add(-1);

                st.push(arr[i]);

            }

            Collections.reverse(list);


            return list;
        }
    }
}
