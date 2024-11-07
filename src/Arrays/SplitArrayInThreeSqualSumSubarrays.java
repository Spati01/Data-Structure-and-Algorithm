package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class SplitArrayInThreeSqualSumSubarrays {



    class Solution {

        public List<Integer> findSplit(int[] arr) {
            List<Integer> list = new ArrayList<>();
            int sum = Arrays.stream(arr).sum();
            if(sum % 3 != 0){
                list.add(-1);
                list.add(-1);
                return list;
            }
            int n = arr.length;
            int result = sum / 3;
            int cur = 0;

            for(int i=0; i<n; i++){
                cur += arr[i];
                if(cur == result){
                    cur = 0;
                    list.add(i);

                }
                if(list.size() == 2){
                    return list;
                }

            }

            list.add(-1);
            list.add(-1);
            return list;
        }
    }

}
