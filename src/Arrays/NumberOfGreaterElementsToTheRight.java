package Arrays;

public class NumberOfGreaterElementsToTheRight {


    class Solution {
        public static int[] count_NGEs(int n, int arr[], int q, int ind[]) {
            // code here
            int[] result = new int[q];

            for(int i=0; i<q; i++){
                int count = 0;
                int j = ind[i] + 1;
                while(j < n){
                    if(arr[ind[i]] < arr[j]){
                        count++;
                    }
                    j++;
                }

                result[i] = count;
            }

            return result;

        }
    }
}
