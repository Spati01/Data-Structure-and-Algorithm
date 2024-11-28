package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    class Solution {
        public int largestRectangleArea(int[] heights) {

            int max = 0;
            int[] pre = prevSmaller(heights);
            int[] next = nextSmaller(heights);


            for(int i=0; i<heights.length; i++){
                int area = (next[i] - pre[i] - 1) * heights[i];
                max = Math.max(max, area);
            }
            return max;

        }

        private int[] prevSmaller(int[] arr){
            int[] prev = new int[arr.length];
            Stack<Integer> st = new Stack<>();

            for(int i=0; i<arr.length; i++){
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }

                if(st.isEmpty()){
                    prev[i] = -1;
                }
                else{
                    prev[i] = st.peek();
                }

                st.push(i);
            }

            return prev;
        }

        private int[] nextSmaller(int[] arr){
            int[] next = new int[arr.length];
            Stack<Integer> st = new Stack<>();

            for(int i=arr.length-1; i>=0; i--){
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }

                if(st.isEmpty()){
                    next[i] = arr.length;
                }
                else{
                    next[i] = st.peek();
                }

                st.push(i);
            }

            return next;
        }
    }
}
