package HashMapHashSet;

import java.util.HashMap;

public class DividePlayersIntoTeamsOfEqualSkill {


    class Solution {
        public long dividePlayers(int[] skill) {
            int n = skill.length;
            int team = n / 2;
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            for(int i : skill){
                sum += i;
                map.put(i,map.getOrDefault(i, 0) + 1);
            }
            if(sum % team != 0)return -1;
            long res = 0;
            int target = sum / team;
            for(int ele : skill){
                if(map.get(ele) == 0){
                    continue;
                }

                map.put(ele, map.get(ele)-1);
                int partner = target - ele;
                if(!map.containsKey(partner) || map.get(partner) == 0){
                    return -1;
                }

                map.put(partner, map.get(partner) - 1);
                res += (long)ele * (long)partner;
            }
            return res;

        }
    }


}
