package Arrays;

import java.util.*;

import java.util.ArrayList;

public class AlternativeSorting {

    class Solution {
        public static ArrayList<Integer> alternateSort(int[] arr) {

            // Your code goes here
            Arrays.sort(arr);
            int i = 0;
            int j = arr.length-1;
            ArrayList<Integer> list = new ArrayList<>();
            while(i <= j){
                if(j >= i){
                    list.add(arr[j--]);
                }

                if(i <= j){
                    list.add(arr[i++]);
                }
            }
            return list;
        }
    }

}
