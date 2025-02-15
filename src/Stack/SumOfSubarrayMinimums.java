package Stack;

import java.util.Stack;

public class SumOfSubarrayMinimums {

    class Solution {
        int n;
        public int sumSubarrayMins(int[] arr) {
            n = arr.length;
            int[] next_sum = next_grater(arr);
            int[] prev_sum = prev_grater(arr);

            int mod = 1000000007;

            long sum = 0;
            for(int i=0; i<n; i++){
                int fast = i - next_sum[i];
                int second = prev_sum[i] - i;

                long prod = (fast * second) % mod;
                prod = (prod * arr[i])%mod;
                sum = (sum % mod + prod) % mod;
            }
            return (int) sum;
        }

        private int[] next_grater(int[] arr){

            int n = arr.length;
            Stack<Integer> st = new Stack<>();
            int[] next = new int[n];

            for(int i=n - 1; i>=0; i--){
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }

                next[i] = (st.isEmpty()) ? n : st.peek();
                st.push(i);
            }
            return next;
        }
        private int[] prev_grater(int[] arr){
            int n = arr.length;
            Stack<Integer> st = new Stack<>();
            int[] prev = new int[n];

            for(int i=0; i<n; i++){
                while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                    st.pop();
                }

                prev[i] = (st.isEmpty()) ? -1 : st.peek();
                st.push(i);
            }
            return prev;
        }
    }
}
