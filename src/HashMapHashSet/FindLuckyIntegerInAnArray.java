package HashMapHashSet;

import java.util.HashMap;

public class FindLuckyIntegerInAnArray {


    class Solution {
        public int findLucky(int[] arr) {

            HashMap<Integer, Integer> lucky  = new HashMap<>();
            for(int luck : arr){
                lucky.put(luck, lucky.getOrDefault(luck, 0) + 1);
            }


            int max =-1;
            for(int num : lucky.keySet()){
                if(num == lucky.get(num)){
                    max = num;
                }
            }

            return max;
        }
    }




}
