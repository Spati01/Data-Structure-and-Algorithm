package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MaximumDifference {

    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = 0;
            right[i] = 0;

        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }

        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(left[i] - right[i]);
            max = Math.max(max, diff);
        }
        return max;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        MaximumDifference maxDiff = new MaximumDifference();
        System.out.println(maxDiff.findMaxDiff(arr));
    }
}