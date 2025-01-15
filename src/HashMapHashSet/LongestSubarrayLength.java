package HashMapHashSet;

import java.util.HashMap;

public class LongestSubarrayLength {

    public class Solution {
        public int solve(int[] A) {

            int longest = 0;
            int balance = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);

            for(int i=0; i<A.length; i++){

                if(A[i] == 1){
                    balance++;
                }else{
                    balance--;
                }


                if(map.containsKey(balance-1)){
                    longest = Math.max(longest, i -  map.get(balance-1));
                }

                if(!map.containsKey(balance))map.put(balance, i);

            }

            return longest;
        }
    }

}
