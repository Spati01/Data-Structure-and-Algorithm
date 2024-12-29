package HashMapHashSet;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysWithDuplicateElements {



    class Solution {
        public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
            // code here

            HashMap<Integer,Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i : a){
                map.put(i, map.getOrDefault(i, 0) + 1);

            }

            for(int i=0; i<b.length; i++){
                if(map.containsKey(b[i]) && map.get(b[i]) != -1){
                    list.add(b[i]);
                    map.put(b[i], -1);
                }
            }

            return list;
        }

    }
}
