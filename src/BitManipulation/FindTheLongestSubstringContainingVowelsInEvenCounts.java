package BitManipulation;

import java.util.HashMap;

public class FindTheLongestSubstringContainingVowelsInEvenCounts {

    class Solution {
        public int findTheLongestSubstring(String s) {
            HashMap<Integer, Integer> mp = new HashMap<>();
            int key = 0;    //T.C. = O(n);
            mp.put(key, -1);//S.C. = O(1);
            int n = s.length();
            int val = 0, maxVal = 0;

            for(int i = 0; i < n; i++){
                char c = s.charAt(i);
                if(c == 'a')    val = (1 << 4);
                else if(c == 'e')   val = (1 << 3);
                else if(c == 'i')   val = (1 << 2);
                else if(c == 'o')   val = (1 << 1);
                else if( c == 'u')  val = (1 << 0);

                key ^= val;

                if(!(mp.containsKey(key)))     mp.put(key, i);

                maxVal = Math.max(i - mp.get(key), maxVal);
                val = 0;
            }
            return maxVal;
        }
    }






}
