package HashMapHashSet;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class NonRepeatingNumbers {


    class Solution
    {
        public int[] singleNumber(int[] nums)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num : nums){
                map.put(num,map.getOrDefault(num, 0) + 1);
            }

            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){

                if(entry.getValue() == 1){
                    list.add(entry.getKey());
                }
            }

            int[] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }
    }

}
