package Math;

public class FindNthRootOfM {

    class Solution {
        public int nthRoot(int n, int m) {
            // code here
            int l = 1;
            int r = m;

            while(l <= r){
                int mid = l + (r - l) / 2;
                if(helper(n, mid) == m){
                    return mid;
                }else if(helper(n, mid) > m){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }

            return -1;
        }

        private int helper(int n, int mid){
            int pro = 1;
            for(int i=0; i<n; i++){
                pro *= mid;
            }

            return pro;
        }

    }
}
