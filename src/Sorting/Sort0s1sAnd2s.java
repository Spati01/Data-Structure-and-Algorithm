package Sorting;

public class Sort0s1sAnd2s {


    class Solution {
        // Function to sort an array of 0s, 1s, and 2s
        public void sort012(int[] arr) {
            // code here
            int l = 0;
            int h = arr.length-1;
            int mid = 0;

            while(mid <= h){
                if(arr[mid] == 0){
                    Swap(arr, mid++, l++);
                }else if(arr[mid] == 1){
                    mid++;
                }else{
                    Swap(arr, mid, h--);
                }
            }
        }

        private void Swap(int[] arr, int s, int e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
        }
    }


}
