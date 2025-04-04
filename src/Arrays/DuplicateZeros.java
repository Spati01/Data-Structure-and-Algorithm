package Arrays;

public class DuplicateZeros {

    class Solution {
        public void duplicateZeros(int[] arr) {
            int z = 0;
            for(int i : arr){
                if(i == 0)z++;
            }

            int i = arr.length - 1, j = arr.length + z - 1;

            while(i !=  j){
                insert(arr, i , j);
                j--;

                if(arr[i] == 0){
                    insert(arr, i , j);
                    j--;
                }
                i--;
            }
        }
        private void insert(int[] arr, int i, int j){
            if(j < arr.length){
                arr[j] = arr[i];
            }
        }
    }
}
