package Math;

public class CarryCounter {
    static int getCarries(String N , String M) {
        // code here
        int n = N.length();
        int m = M.length();
        int i = n-1;
        int j = m-1;
        int count = 0;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitN = i >= 0 ? N.charAt(i) - '0' : 0;
            int digitM = j >= 0 ? M.charAt(j) - '0' : 0;

            int sum = digitN + digitM + carry;

            carry = sum / 10;

            if(carry > 0){
                count++;
            }
            i--;
            j--;

        }
        return count;
    }
}
