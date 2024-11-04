package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class FindAllTripletsWithZeroSum {

    class Solution {
        public List<List<Integer>> findTriplets(int[] arr) {
            // Your code here

            List<List<Integer>> list = new ArrayList();

            int sum = 0;
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    for(int k=j+1; k<arr.length; k++){
                        if(arr[i] + arr[j] + arr[k] == 0){
                            list.add(Arrays.asList(i, j, k));
                        }
                    }
                }
            }

            return list;
        }
    }
}
