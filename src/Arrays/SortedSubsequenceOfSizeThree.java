package Arrays;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class SortedSubsequenceOfSizeThree {

    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        if(n < 3) return new ArrayList<>();

        int[] sml = new int[n];
        int[] grt = new int[n];



        sml[0] =arr[0];
        for(int i=1; i<n; i++){
            sml[i] = Math.min(sml[i-1] , arr[i]);
        }
        grt[n-1] = arr[n-1];
        for(int i=n-2; i>= 0; i--){
            grt[i] = Math.max(grt[i+1],arr[i]);
        }


        for(int i=1; i<n-1; i++){

            if(arr[i] > sml[i-1] && arr[i] < grt[i+1]){
                List<Integer> list = new ArrayList<>();
                list.add(sml[i-1]);
                list.add(arr[i]);
                list.add(grt[i+1]);
                return list;
            }
        }

        return new ArrayList<>();
    }


}
