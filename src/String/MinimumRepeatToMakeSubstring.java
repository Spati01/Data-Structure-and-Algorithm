package String;

public class MinimumRepeatToMakeSubstring {



    class Solution {
        static int minRepeats(String s1, String s2) {
            // code here
            for(int i=0; i<s2.length(); i++){
                if(!s1.contains(String.valueOf(s2.charAt(i)))){
                    return -1;
                }
            }

            StringBuilder sb = new StringBuilder();
            int count = 0;
            while(sb.length() < s2.length()){
                count++;
                sb.append(s1);
            }

            if(sb.toString().contains(s2)){
                return count;
            }
            sb.append(s1);
            count++;


            return sb.toString().contains(s2) ? count : -1 ;
        }
    };
}
