package BitManipulation;

public class OddOrEven {


    class Solution {
        static String oddEven(int n) {
            // code here
            return ((n & 1) == 0) ? "even" : "odd";
        }
    }
}
