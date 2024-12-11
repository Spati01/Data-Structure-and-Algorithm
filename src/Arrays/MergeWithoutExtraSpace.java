package Arrays;

import java.util.*;

public class MergeWithoutExtraSpace {


    class Solution {
        // Function to merge the arrays.
        public void mergeArrays(int a[], int b[]) {
            // code here

            int n = a.length;
            int m = b.length;

            int i = n-1;
            int j = 0;

            while(i >= 0 && j < m){
                if(a[i] > b[j]){
                    swap(a,b, i, j);
                }
                i--;
                j++;
            }

            Arrays.sort(a);
            Arrays.sort(b);


        }

        private void swap(int[] a, int[] b, int i, int j){
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
        }
    }

}
