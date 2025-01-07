package Arrays;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {

    class Solution {
        public List<String> stringMatching(String[] words) {
            int n = words.length;
            List<String> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){


                    if(i != j && words[i].contains(words[j]) && !list.contains(words[j])){
                        list.add(words[j]);
                    }
                }
            }

            return list;
        }
    }
}
