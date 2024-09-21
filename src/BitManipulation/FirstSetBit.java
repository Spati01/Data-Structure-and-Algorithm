package BitManipulation;

public class FirstSetBit {


    class Solution
    {
        //Function to find position of first set bit in the given number.
        public static int getFirstSetBit(int n){

            // Your code here
            if(n == 0) return 0;
            int position = 1;
            while((n & 1) == 0){
                n >>= 1;
                position++;
            }
            return position;
        }
    }
}
