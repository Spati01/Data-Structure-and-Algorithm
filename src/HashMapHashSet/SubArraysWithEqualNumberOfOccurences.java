package HashMapHashSet;

import java.util.HashMap;

public class SubArraysWithEqualNumberOfOccurences {


    class Solution {

        static int sameOccurrence(int arr[], int x, int y) {
            // write code here
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0, 1);
            int count = 0;
            int ans = 0;

            for(int i : arr){
                if(i == x)
                    count++;
                else if (i == y)
                    count--;

                if(map.containsKey(count)){
                    ans += map.get(count);
                }
                map.put(count, map.getOrDefault(count, 0)+1);


            }
            return ans;
        }



    }
}
