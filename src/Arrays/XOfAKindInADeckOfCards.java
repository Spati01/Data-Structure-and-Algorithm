package Arrays;

import java.util.HashMap;

public class XOfAKindInADeckOfCards {

    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int num : deck){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int ans = 0;
            for(int key : map.keySet()){
                ans = GCD(ans, map.get(key));
            }


            return ans >= 2 ? true : false;
        }

        public int GCD(int a, int b){
            return b==0 ? a : GCD(b, a%b);
        }
    }
}
