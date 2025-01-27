package String;

import java.util.HashMap;
import java.util.*;

public class IsomorphicStrings {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> sTot =  new HashMap<>();
            HashMap<Character, Character> tTos = new HashMap<>();

            int n = s.length();

            for(int i=0; i<n; i++){
                char ss = s.charAt(i);
                char tt = t.charAt(i);

                if(!sTot.containsKey(ss)){
                    sTot.put(ss, tt);
                }

                if(!tTos.containsKey(tt)){
                    tTos.put(tt, ss);
                }

                if(sTot.get(ss) != tt || tTos.get(tt) != ss){
                    return false;
                }


            }

            return true;
        }
    }

    class Solution1 {
        public boolean isIsomorphic(String s, String t) {
            int[] sTot = new int[128];
            int[] tTos = new int[128];
            Arrays.fill(sTot, -1);
            Arrays.fill(tTos, -1);

            StringBuilder sTo = new StringBuilder(s);
            StringBuilder tTo = new StringBuilder(t);

            int n = s.length();

            for(int i=0; i<n; i++){
                char ss = sTo.charAt(i);
                char tt = tTo.charAt(i);

                if(sTot[ss] == -1){
                    sTot[ss] = tt;
                }

                if(tTos[tt] == -1){
                    tTos[tt] = ss;
                }


                if(sTot[ss] != tt || tTos[tt] != ss){
                    return false;
                }


            }

            return true;
        }
    }
}
