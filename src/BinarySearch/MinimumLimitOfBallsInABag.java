package BinarySearch;

public class MinimumLimitOfBallsInABag {


    class Solution {
        public int minimumSize(int[] nums, int o) {


            int s = 1;
            int e = Integer.MAX_VALUE;

            int ans = 0;

            while(s <= e){
                int m = s + (e-s) / 2;

                if(check(nums,m,o)){
                    ans = m;
                    e = m - 1;
                }else{
                    s = m + 1;
                }
            }
            return ans;
        }
        private boolean check(int[] arr, int m, int o){
            int operation = 0;

            for(int num : arr){
                operation += (num - 1) / m;
            }

            return operation <= o;
        }
    }
}
