package BitManipulation;

public class FindSmallest {
    public static int getSmallest(int n) {
        // code here
        int smallestX = 1;

        // Find the smallest power of 2 that fits the bit width of n and ensures n & X = 0
        while ((n & smallestX) != 0) {
            smallestX <<= 1; // Shift left to get the next power of 2
        }

        return smallestX;



    }
}
