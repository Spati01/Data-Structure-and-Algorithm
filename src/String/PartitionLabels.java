package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {


    class Solution {
        public List<Integer> partitionLabels(String s) {

            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), i);
                }else{
                    map.put(s.charAt(i), i);
                }
            }

            int max = 0;
            int pre = -1;

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<s.length(); i++){
                max = Math.max(max, map.get(s.charAt(i)));

                if(i == max){
                    list.add(max - pre);
                    pre = max;
                }
            }

            return list;
        }
    }
}
