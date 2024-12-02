package String;

import java.util.ArrayList;

public class SearchPatternKMPAlgorithm {

    class SolutionOne {

        ArrayList<Integer> search(String pat, String txt) {
            // your code here

            ArrayList<Integer> list = new ArrayList<>();

            if(txt == null || txt.isEmpty() || pat.length() > txt.length()){
                return list;
            }


            int len = pat.length()-1;

            for(int i=0; i<txt.length() - len; i++){
                if(txt.substring(i,(i+pat.length())).equals(pat)){
                    list.add(i);
                }
            }
            return list;
        }
    }



// User function Template for Java

    class SolutionTwo {

        ArrayList<Integer> search(String pat, String txt) {


            ArrayList<Integer> list = new ArrayList<>();

            if(txt == null || txt.isEmpty() || pat.length() > txt.length()){
                return list;
            }

            int idx = txt.indexOf(pat);

            while(idx != -1){
                list.add(idx);
                idx = txt.indexOf(pat, idx+1);

            }
            return list;

        }
    }

}
