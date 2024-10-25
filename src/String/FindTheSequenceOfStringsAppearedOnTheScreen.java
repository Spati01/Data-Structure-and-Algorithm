package String;

import java.util.ArrayList;
import java.util.List;

public class FindTheSequenceOfStringsAppearedOnTheScreen {


    class Solution {
        public List<String> stringSequence(String target) {
            ArrayList<String> list = new ArrayList<>();
            String s = "";
            int i = 0;
            while(i < target.length()){
                char ch = 'a';
                while(target.charAt(i) != ch){
                    list.add(s+ch);
                    ch++;
                }
                s += ch;
                list.add(s);
                i++;
            }


            return list;

        }
    }
}
