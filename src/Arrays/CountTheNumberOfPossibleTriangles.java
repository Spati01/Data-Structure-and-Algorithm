package Arrays;
import java.util.*;


public class CountTheNumberOfPossibleTriangles {


    class Solution {
        // Function to count the number of possible triangles.
        static int countTriangles(int arr[]) {
            // code here
            int n = arr.length;
            Arrays.sort(arr);

            int count  = 0;

            for(int i=n-1; i>=0; i--){
                int l = 0;
                int r = i-1;

                while(l < r){
                    if(arr[l] + arr[r] > arr[i]){
                        count+=(r-l);
                        r--;
                    }else{
                        l++;
                    }
                }
            }
            return count;
        }
    }
}
