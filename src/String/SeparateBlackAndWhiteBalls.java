package String;

public class SeparateBlackAndWhiteBalls {

    class Solution {
        public long minimumSteps(String s) {

            long black = 0;
            long count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    count += black;
                }else{
                    black++;
                }
            }
            return count;
        }
    }


}
