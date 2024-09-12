package Math;

public class CountIntegersWithEvenDigitSum {
    class Solution {
        public int countEven(int num) {

            int count = 0;
            for(int i=1; i<=num; i++){
                int digit = 0;
                int copy = i;

                while(copy != 0){
                    digit += copy % 10;
                    copy /= 10;


                }
                count += ((digit % 2 == 0) ? 1 : 0);
            }
            return count;
        }
    }


}
