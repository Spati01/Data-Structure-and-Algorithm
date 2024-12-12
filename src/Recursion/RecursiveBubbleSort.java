package Recursion;

public class RecursiveBubbleSort {


    class Solution {
        // Function to sort the array using bubble sort algorithm.
        public static void bubbleSort(int arr[]) {
            // code here
            int n = arr.length;

            Recursive(arr, n);


        }



        private static void Recursive(int[] arr, int n){
            if(n == 1) return;

            int didSwap = 0;

            for(int i=0; i<= n-2; i++){
                if(arr[i] > arr[i+1]){
                    doSwap(arr, i, i+1);
                    didSwap = 1;
                }
            }

            if(didSwap == 0) return;


            Recursive(arr, n-1);

        }

        private static void doSwap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
