package Arrays;

public class CountInversions {


    class Solution {
        // Function to count inversions in the array.
        static int inversionCount(int arr[]) {
            // Your Code Here
            int n = arr.length;


            return Divide(arr, 0, n-1);
        }

        private static int Divide(int[] arr, int s, int e){

            int count = 0;

            if(s < e){

                int m = s + (e - s) / 2;

                count += Divide(arr, s, m);
                count += Divide(arr, m+1, e);

                count += mergeSort(arr, s, m, e);
            }

            return count;

        }


        private static int mergeSort(int[] arr, int s, int m, int e){


            int[] merge = new int[e-s+1];

            int count = 0;
            int x = 0;
            int temp = s;
            int carry = m + 1;

            while(temp <= m && carry <= e){
                if(arr[temp] <= arr[carry]){
                    merge[x++] = arr[temp++];
                }else{
                    merge[x++] = arr[carry++];
                    count += m - temp + 1;
                }
            }


            while(temp <= m){
                merge[x++] = arr[temp++];

            }

            while(carry <= e){
                merge[x++] = arr[carry++];
            }


            for(int i=0; i<x; i++){
                arr[s + i] = merge[i];
            }

            return count;
        }

    }
}
