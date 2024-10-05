package Arrays;

public class NotASubsetSum {

    class Solution {
        public long findSmallest(int[] arr) {
            // Your code goes here
            int ans = 1;
            for(int x : arr){
                if(x > ans)return ans;
                ans += x;
            }

            return ans;
        }
    }

}
