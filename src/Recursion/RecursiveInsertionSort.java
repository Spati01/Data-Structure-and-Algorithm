package Recursion;

public class RecursiveInsertionSort {


    class Solution {
        // Please change the array in-place
        public void insertionSort(int arr[]) {
            // code here
            int n = arr.length;
            Recursive(arr, 0, n);
        }

        private void Recursive(int[] arr, int i, int n){

            if(i == n)return;


            int j  = i;
            while(j > 0 && arr[j-1] > arr[j]){
                doSwap(arr, j-1, j);
                j--;
            }

            Recursive(arr, i+1, n);

        }

        private void doSwap(int[] arr, int i, int j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
