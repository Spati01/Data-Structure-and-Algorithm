package Arrays;

public class TrappingRainWater {


    class Solution {
        public int maxWater(int arr[]) {
            // code here

            int n = arr.length;

            int left = 0;
            int right = 0;
            int i = 0;
            int j = n - 1;
            int ans = 0;

            while(i < j){
                if(arr[i] >  left){
                    left = Math.max(left, arr[i]);
                }
                if(arr[j] > right){
                    right = Math.max(right, arr[j]);
                }

                if(left < right){
                    ans += (left - arr[i]);
                    i++;
                }else{

                    ans += (right - arr[j]);
                    j--;
                }

            }

            return ans;
        }
    }
}
