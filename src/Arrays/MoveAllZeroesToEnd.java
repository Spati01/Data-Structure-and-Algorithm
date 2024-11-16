package Arrays;

public class MoveAllZeroesToEnd {

    class Solution {
        void pushZerosToEnd(int[] arr) {
            // code here
            int j=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != 0){
                    swap(arr, i, j);

                    j++;
                }
            }
        }
        private void swap(int[] arr, int l, int r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
    }
}
