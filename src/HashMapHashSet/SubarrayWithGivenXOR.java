package HashMapHashSet;

import java.util.HashMap;

public class SubarrayWithGivenXOR {

    public class Solution {
        public int solve(int[] A, int B) {

            int n = A.length;
            HashMap<Integer, Integer> map = new HashMap<>();

            map.put(0, 1);
            int xor = 0;
            int count = 0;
            for(int i=0; i<n; i++){
                xor ^= A[i];

                if(map.containsKey(xor^B)){
                    count += map.get(xor^B);
                }

                if(map.containsKey(xor)){
                    map.put(xor, map.get(xor) + 1);
                }else{
                    map.put(xor, 1);
                }
            }

            return count;
        }
    }

}
