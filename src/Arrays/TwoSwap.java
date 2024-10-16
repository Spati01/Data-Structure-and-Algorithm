package Arrays;

import java.util.List;

public class TwoSwap {

    class Solution {

        public boolean checkSorted(List<Integer> arr) {
            // code here
            boolean isAscending = true;
            boolean isDescending = true;

            for(int i=1; i< arr.size(); i++){
                if(arr.get(i) < arr.get(i-1)){
                    isAscending = false;
                }

                if(arr.get(i) > arr.get(i-1)){
                    isDescending = false;
                }

            }
            return isAscending || isDescending;
        }
    }


}
