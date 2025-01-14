package Arrays;

public class EquilibriumPoint {


    class Solution {
        // Function to find equilibrium point in the array.
        public static int findEquilibrium(int arr[]) {
            // code here

            int n = arr.length;
            long left = 0;
            long total = 0;

            for(int i=0; i<n; i++){
                total += arr[i];
            }

            for(int i=0; i<n; i++){
                long right = total - left - arr[i];
                if(left == right){
                    return i;
                }else{
                    left += arr[i];
                }
            }

            return -1;

        }
    }

}
