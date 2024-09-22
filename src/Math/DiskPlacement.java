package Math;

public class DiskPlacement {

    class Solution {
        public static long maxProduct(int n) {
            // code here
            if(n <= 1) return 0;

            return (long)(n / 2) * (n - n/2);
        }
    }

}
