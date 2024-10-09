package LinkedList;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    class Solution {
        public int minSwaps(String s) {


            int close = 0;
            int open = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == ']'){
                    if(open > 0)
                        --open;
                    else
                        ++close;
                }else{
                    open++;
                }
            }

            return ((close + 1) >> 1);
        }
    }
}
