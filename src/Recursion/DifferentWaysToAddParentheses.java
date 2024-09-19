package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {


    class Solution {
        public List<Integer> diffWaysToCompute(String exe) {
            return Solve(exe);

        }

        private List<Integer> Solve(String exe){


            List<Integer> list = new ArrayList<>();

            for(int i=0; i<exe.length(); i++){
                char ch = exe.charAt(i);
                if(ch == '-' || ch == '+'|| ch == '*'){
                    List<Integer> left = Solve(exe.substring(0,i));
                    List<Integer> right = Solve(exe.substring(i+1));

                    for(int l : left){
                        for(int r : right){
                            if(ch == '+'){
                                list.add(l + r);
                            }else if(ch == '-'){
                                list.add(l - r);
                            }else if(ch == '*'){
                                list.add(l * r);
                            }
                        }
                    }

                }
            }

            if(list.size() == 0) {
                list.add(Integer.parseInt(exe));
            }

            return list;
        }
    }

}
