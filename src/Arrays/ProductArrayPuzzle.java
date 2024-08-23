package Arrays;

public class ProductArrayPuzzle {


    public static long[] productExceptSelf(int nums[]) {
        // code here
        int n = nums.length;
        long[] demo = new long[n];
        long[] result = new long[n];

        demo[0] = 1;
        for(int i=1; i<n; i++){
            demo[i] = demo[i-1] * nums[i-1];
        }

        long product = 1;
        for(int i=n-1; i>=0; i--){
            result[i] = demo[i] * product;
            product *= nums[i];
        }
        return result;
    }
}
