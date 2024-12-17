package Arrays;

public class RepetitiveAdditionOfDigits {


    class Solution {
        public int singleDigit(int n) {
            // code here

            if(n == 0)return 0;

            while(n > 9){
                int sum = 0;
                while(n > 0){

                    sum += n % 10;

                    n /= 10;
                }
                n = sum;
            }

            return (int) n;
        }
    }
}
