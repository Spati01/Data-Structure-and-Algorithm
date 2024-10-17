package String;

public class MaximumSwaps {

    class Solution {
        public int maximumSwap(int num) {

            String str = String.valueOf(num);
            char[] ch = str.toCharArray();
            int[] last = new int[10];

            for(int i=0; i<ch.length; i++){
                last[ch[i] - '0'] = i;
            }

            for(int i=0; i<ch.length; i++){
                for(int d = 9; d > ch[i] - '0'; d--){
                    if(last[d] > i){
                        swap(ch, i, last[d]);
                        return Integer.parseInt(new String(ch));
                    }
                }
            }
            return num;

        }

        private void swap(char[] ch, int i, int j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
    }
}
