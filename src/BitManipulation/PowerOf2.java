package BitManipulation;

public class PowerOf2 {

    class Solution {

        // Function to check if given number n is a power of two.
        public static boolean isPowerofTwo(long n) {

            // Your code here
            int count = 0;
            while(n > 0){
                if((n & 1) == 1){
                    count++;
                }
                n >>= 1;
            }
            return count == 1 ? true : false;
        }
    }
}
