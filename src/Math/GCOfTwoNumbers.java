package Math;

public class GCOfTwoNumbers {

    public static int gcd(int a, int b) {
        // code here
        return  b==0 ? a : gcd(b,a%b);
    }
}
