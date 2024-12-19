package Arrays;

public class MaxChunksToMakeSorted {

    class Solution {
        public int maxChunksToSorted(int[] arr) {

            int n = arr.length;

            int[] prefix = new int[n];
            int[] sufix = new int[n];

            prefix[0] = arr[0];
            for(int i=1; i<n; i++){
                prefix[i] = Math.max(prefix[i-1], arr[i]);
            }

            sufix[n-1] = arr[n-1];

            for(int i = n-2; i>= 0; i--){
                sufix[i] = Math.min(sufix[i+1], arr[i]);
            }

            int ans = 1;
            for(int i=0; i<n-1; i++){
                if(prefix[i] <= sufix[i+1]){
                    ans++;
                }
            }

            return ans;
        }
    }


}
