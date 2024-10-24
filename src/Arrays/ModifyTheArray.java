package Arrays;

import java.util.ArrayList;

public class ModifyTheArray {


    class Solution {
        static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
            // Complete the function
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i<arr.length-1; i++){
                if(arr[i] == arr[i+1]){
                    arr[i] += arr[i+1];
                    arr[i+1] = 0;
                }
            }
            int count = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != 0){
                    list.add(arr[i]);
                    count++;
                }
            }
            while(count < arr.length){
                list.add(0);
                count++;
            }

            return list;
        }
    }

}
