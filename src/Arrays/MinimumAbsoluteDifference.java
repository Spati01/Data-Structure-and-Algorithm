package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MinimumAbsoluteDifference {

    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {

            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;

            for(int i=0; i<arr.length-1; i++){
                int diff = arr[i + 1] - arr[i];
                if (diff < min) {
                    min = diff;
                    result.clear();
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[i + 1]);
                    result.add(pair);
                } else if (diff == min) {

                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[i + 1]);
                    result.add(pair);
                }
            }

            return result;
        }
    }
}
