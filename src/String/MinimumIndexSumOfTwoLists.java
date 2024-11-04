package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class MinimumIndexSumOfTwoLists {

    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            ArrayList<String> list = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            for(int i=0; i<list1.length; i++){
                for(int j=0; j<list2.length; j++){
                    if(list1[i].equals(list2[j])){
                        if(i+j < min){
                            min = (i+j);
                            list.clear();
                            list.add(list1[i]);
                        }else if(i+j == min){
                            list.add(list1[i]);
                        }
                    }
                }
            }

            return list.toArray(new String[0]);
        }
    }





    class hashMap {
        public String[] findRestaurant(String[] list1, String[] list2) {

           HashMap<String, Integer> map = new HashMap<String, Integer>();
            ArrayList<String> list = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            for(int i=0; i<list1.length; i++){
                map.put(list1[i], i);
            }
            for(int i=0; i<list2.length; i++){
                if(map.containsKey(list2[i])){
                    int idx = i + map.get(list2[i]);
                    if(idx < min){
                        min = idx;
                        list.clear();
                        list.add(list2[i]);
                    }else if (idx == min){
                        list.add(list2[i]);
                    }
                }
            }
            return list.toArray(new String[0]);
        }
    }
}
