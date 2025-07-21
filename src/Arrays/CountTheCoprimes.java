package Arrays;

public class CountTheCoprimes {

    class Solution {
        int cntCoprime(int[] arr) {
            // code here
            int n = arr.length;
            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(gcd(arr[i], arr[j]) == 1){
                        count++;
                    }
                }
            }

            return count;
        }

        private int gcd(int a, int b){
            return b == 0 ? a : gcd(b, a % b);
        }
    }

}
