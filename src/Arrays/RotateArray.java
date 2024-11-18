package Arrays;

public class RotateArray {


    class Solution {
        // Function to rotate an array by d elements in counter-clockwise direction.
        static void rotateArr(int arr[], int d) {
            // add your code here
            int n = arr.length;
            d %= n;
            reverseArray(arr, 0, d-1);
            reverseArray(arr, d, n-1);

            reverseArray(arr, 0, n-1);


        }
        private  static void reverseArray(int[] arr, int l, int r){

            while(l <= r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

}
