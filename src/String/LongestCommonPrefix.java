package String;

public class LongestCommonPrefix {

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs == null || strs.length == 0)return "";

            String  demo = strs[0];
            for(int i=1; i<strs.length; i++){
                while(strs[i].indexOf(demo) != 0){
                    demo = demo.substring(0, demo.length() - 1);

                }
                if(demo.isEmpty()){
                    return "";
                }
            }

            return demo;

        }
    }
}
