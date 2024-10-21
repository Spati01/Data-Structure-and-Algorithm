package Arrays;

public class SplitTheArray {

    class Solution {

        public static int countgroup(int arr[]) {
            // Complete the function
            int n = arr.length;
            int mod = 1000000007;
            int xor = 0;
            for(int i=0; i<n; i++){
                xor = xor ^ arr[i];
            }

            if(xor != 0)return 0;

            int ans = 1;
            for(int i=0; i<n-1; i++){
                ans = (ans*2)%mod;
            }
            return ans - 1;
        }
    }

}
