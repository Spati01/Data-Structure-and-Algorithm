package BinarySearch;
import java.util.*;

public class AggressiveCows {


    // User function Template for Java
    class Solution {
        public static int aggressiveCows(int[] stalls, int k) {
            // code here
            int n = stalls.length;

            Arrays.sort(stalls);

            int start = 1;
            int end = stalls[n-1] - stalls[0];
            int ans = 0;

            while(start <= end){
                int mid = start + (end - start) / 2;

                if(isPossible(stalls,k,n,mid)){
                    ans = mid;

                    start = mid + 1;
                }else{

                    end = mid - 1;
                }
            }

            return ans;

        }

        private static boolean isPossible(int[] arr, int k, int n, int minValue){

            int cows = 1;
            int lastPos = arr[0];

            for(int i=1; i<n; i++){
                if(arr[i] - lastPos >= minValue){
                    cows++;
                    lastPos = arr[i];
                }

                if(cows >= k){
                    return true;

                }
            }

            return false;

        }
    }
}
