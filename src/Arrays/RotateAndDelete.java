package Arrays;

import java.util.ArrayList;

public class RotateAndDelete {

    class Solution {
        public static int rotateDelete(ArrayList<Integer> arr) {
            // code here
            int n = arr.size()-1;
            int k  = 1;
            while(n > 1){
                int last = arr.remove(n-1);
                arr.add(0, last);
                if(k < n-1){
                    arr.remove(n - k + 1);
                    k++;

                }else{
                    arr.remove(0);
                }
                n = arr.size()-1;
            }
            return arr.get(0);
        }
    }
}
