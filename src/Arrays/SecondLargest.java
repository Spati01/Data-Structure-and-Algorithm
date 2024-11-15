package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SecondLargest {


    class Test {
        public int getSecondLargest(int[] arr) {
            // Code Here
            int n = arr.length;
            HashSet<Integer> set = new HashSet<>();
            for(int i : arr){
                set.add(i);
            }

            if(set.size() == 1)return -1;

            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            return list.get(list.size() - 2);

        }
    }






//User function Template for Java

    class Solution {
        int print2largest(int arr[], int n) {
            // code here
            int max = -1;
            int min = -1;
            for(int i=0; i<n; i++){
                if(arr[i] > max)
                    max = arr[i];
            }
            for(int i=0;i<n;i++){
                if(arr[i]<max && arr[i]>min)
                    min=arr[i];
            }
            return min;


        }

    }








}
