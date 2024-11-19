package Arrays;

import java.util.ArrayList;

public class NextPermutation {

    class Solution {
        void nextPermutation(int[] arr) {
            // code here
            ArrayList<Integer> list = new ArrayList<>();

            int N = arr.length;

            int k = N - 2;

            for (int i = N - 1; i > 0; i--) {
                if (arr[i] > arr[i - 1]) {
                    k = i - 1;
                    break;
                }
            }

            if (k == N - 2 && arr[k] >= arr[k + 1]) {
                reverse(arr, 0, N - 1);
            } else {
                for (int i = N - 1; i > k; i--) {
                    if (arr[i] > arr[k]) {
                        int temp = arr[k];
                        arr[k] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
                reverse(arr, k + 1, N - 1);
            }

            for (int i = 0; i < N; i++) {
                list.add(arr[i]);
            }

        }

        static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
