package Arrays;

import java.util.HashMap;

public class MakeTwoArraysEqualByReversingSubarrays {
    // **********1st approach***********
    /*
    public boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0; i<target.length; i++){
            if(target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }

    */

    // ******2nd approach********

    public boolean canBeEqual(int[] target, int[] arr) {

        if(target.length != arr.length)return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<target.length; i++){
            map.put(target[i], map.getOrDefault(target[i], 0)+1);
        }

        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                return false;
            }

            map.put(arr[i],map.get(arr[i]) - 1);
            if(map.get(arr[i]) < 0) return false;

        }
        return true;
    }
}
