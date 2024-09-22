package String;

public class LongestPrefixSuffix {


    class Solution {
        int lps(String str) {
            // code here
            int[] lps = new int[str.length()];
            int i = 1, len = 0;
            while(i<str.length()){
                if(str.charAt(len)==str.charAt(i)){
                    len++;
                    lps[i] = len;
                    i++;

                }else{
                    if(len > 0) len = lps[len -1];
                    else i++;
                }
            }


            return lps[str.length()-1];
        }
    }
}
