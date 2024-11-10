package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfTwoSortedArraysWithDistinctElements {

    class Solution {
        // Function to return a list containing the union of the two arrays.
        public static ArrayList<Integer> findUnion(int a[], int b[]) {
            // add your code here
            HashSet<Integer> set = new HashSet<>();
            for(int num : a){
                set.add(num);
            }
            for(int num : b){
                set.add(num);
            }

            ArrayList<Integer> list = new ArrayList(set);
            Collections.sort(list);

            return list;
        }
    }
}
