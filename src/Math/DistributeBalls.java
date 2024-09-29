package Math;

public class DistributeBalls {




    class Solution {
        private final static  int mod = 1000000007;
        public static int distributeBalls(int n) {
            // code here
            if(n < 2){
                return 0;
            }
            long total = pow(2,n) - 2;

            return (int) ((total + mod) % mod);
        }
        private static long pow(int base, int exp){
            long result = 1;
            long current = base;
            while(exp > 0){
                if((exp & 1) == 1){
                    result = (result * current) % mod;
                }
                current = (current * current) % mod;
                exp >>= 1;
            }
            return result;
        }
    }

}
