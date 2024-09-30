package BitManipulation;

public class FindPositionOfSetBit {

    class Solution {
        static int findPosition(int N) {
            if (N == 0) return -1;


            if ((N & (N - 1)) != 0) return -1;


            int position = 0;
            while (N > 1) {
                N = N >> 1;
                position++;
            }

            return position + 1;

        }
    }
}
