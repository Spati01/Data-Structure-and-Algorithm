package HashMapHashSet;

import java.util.*;


public class MakeArrayElementsUnique {


    class Solution {
        public int minIncrements(int[] arr) {
            // Code here
            Arrays.sort(arr);
            int operation = 0;
            for(int i=1; i<arr.length; i++){
                if(arr[i] <= arr[i-1]){
                    operation += arr[i-1] - arr[i] + 1;
                    arr[i] = arr[i-1] + 1;
                }
            }
            return operation;
        }
    }
}
