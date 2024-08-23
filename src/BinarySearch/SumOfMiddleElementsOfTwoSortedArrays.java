package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfMiddleElementsOfTwoSortedArrays {

    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        List<Integer> list = marge(arr1, arr2);
        return findMid(list);

    }
    private List<Integer> marge(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();

        for(int val : arr1){
            list.add(val);
        }
        for(int val : arr2){
            list.add(val);
        }
        Collections.sort(list);
        return  list;
    }

    private int findMid(List<Integer> list){

        int size = list.size();
        if(size == 0) return 0;

        if(size % 2 == 0){
            int mid1 = size / 2 - 1;
            int mid2 = size / 2;

            return list.get(mid1) + list.get(mid2);
        }else{

            return list.get(size / 2);
        }

    }
}
