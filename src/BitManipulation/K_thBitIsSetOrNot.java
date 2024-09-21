package BitManipulation;

public interface K_thBitIsSetOrNot {

    class CheckBit {
        // Function to check if Kth bit is set or not.
        static boolean checkKthBit(int n, int k) {
            // Your code here
            int mask = 1 << k;
            return (n & mask) != 0;
        }
    }
}
