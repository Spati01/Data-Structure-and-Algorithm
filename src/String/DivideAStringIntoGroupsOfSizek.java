package String;

import java.util.ArrayList;

public class DivideAStringIntoGroupsOfSizek {


    class Solution {
        public String[] divideString(String s, int k, char fill) {

            int n = s.length();
            ArrayList<String> list = new ArrayList<>();

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append(s.charAt(i));

                if(sb.length() == k){
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }

                if(i == n-1 && !sb.isEmpty()){
                    while(sb.length() < k){
                        sb.append(fill);
                    }
                    list.add(sb.toString());
                }

            }

            String[] result = new String[list.size()];

            for(int i=0; i<list.size(); i++){
                result[i] = list.get(i);
            }

            return result;
        }
    }
}
