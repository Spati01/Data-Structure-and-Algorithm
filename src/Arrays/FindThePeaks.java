package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {

    class Solution {
        public List<Integer> findPeaks(int[] moun) {

            List<Integer> list = new ArrayList<>();
            for(int i=1; i<moun.length-1; i++){
                if(moun[i] > moun[i-1] && moun[i] > moun[i+1]){
                    list.add(i);
                }
            }
            return list;
        }
    }
}
