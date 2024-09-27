package BitManipulation;

public class BitDifference {


    class Solution{

        // Function to find number of bits needed to be flipped to convert A to B
        public static int countBitsFlip(int a, int b){

            // Your code here
            int n = a ^ b;
            int count = 0;
            while(n > 0){
                count += (n & 1);
                n >>= 1;
            }

            return count;

        }


    }





}
