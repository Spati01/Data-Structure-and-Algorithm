package String;
import java.math.BigInteger;
public class MultiplyStrings {
    class Solution {
        public String multiply(String num1, String num2) {


            BigInteger b1 = new BigInteger(num1);
            BigInteger b2 = new BigInteger(num2);

            // Perform multiplication
            BigInteger product = b1.multiply(b2);

            // Convert the result back to string and return it
            return product.toString();



        }
    }

}
