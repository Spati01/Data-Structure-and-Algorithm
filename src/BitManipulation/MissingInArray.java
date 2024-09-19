package BitManipulation;

public class MissingInArray {
    class Solution {

        // Note that the size of the array is n-1
        int missingNumber(int n, int arr[]) {

            // Your Code Here
            int xor1 = 0;
            int xor2 = 0;
            for(int i=0; i<n-1; i++){

                xor2 ^= arr[i];
                xor1 ^= (i+1);


            }

            xor1 ^= n;

            return   xor1 ^ xor2;
        }
    }


}
