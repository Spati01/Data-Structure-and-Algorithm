package Math;

public class CheckDivisibilityByDigitSumAndProduct {

    class Solution {
        public boolean checkDivisibility(int n) {

            int sum = 0;
            int prod = 1;


            String str = String.valueOf(n);

            for(int i=0; i<str.length(); i++){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                prod *= Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            int total_sum = sum += prod;

            return n % total_sum == 0;
        }
    }
}
