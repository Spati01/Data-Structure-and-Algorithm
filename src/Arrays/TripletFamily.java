package Arrays;

import java.util.HashSet;
import java.util.*;

public class TripletFamily {

    //TC : O(N)2
    //SC : O(1)

    class Solution0{
        public boolean findTriplet(int[] arr) {
            Arrays.sort(arr);
            for(int i=0; i<arr.length-2; i++){
                for(int j=i+1; j<arr.length-1; j++){
                    int k = j+1;
                    while(k < arr.length && arr[i] + arr[j] >=  arr[k]){
                        if(arr[k] == arr[i] + arr[j]){
                            return true;
                        }
                        k++;
                    }
                }
            }
            return false;
        }
    }


    //TC : O(N)
    //SC : O(N)
    class Solution {
        public boolean findTriplet(int[] arr) {
            HashSet<Integer> set = new HashSet<>();
            for(int num : arr){
                set.add(num);
            }

            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(set.contains(arr[i] + arr[j])){
                        return true;
                    }
                }
            }

            return false;

        }



    }


}
