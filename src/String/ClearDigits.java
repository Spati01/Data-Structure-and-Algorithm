package String;

import java.util.*;

public class ClearDigits {

    class Solution {
        public String clearDigits(String s) {
            int j = 0;
            char[] ch = new char[s.length()];

            for(int i=0; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    j--;
                }else{
                    ch[j++] = s.charAt(i);
                }
            }
            return String.valueOf(Arrays.copyOfRange(ch, 0, j));
        }
    }
}
