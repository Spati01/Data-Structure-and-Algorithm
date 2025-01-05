package String;

public class ShiftingLettersII {

    class Solution {
        public String shiftingLetters(String s, int[][] shifts) {



            int n = s.length();
            int[] delta = new int[n+1];

            for(int[] shift : shifts){
                int start = shift[0];
                int end = shift[1];
                int direction = shift[2];


                if(direction == 1){
                    delta[start] += 1;
                    delta[end + 1] -= 1;

                }else{

                    delta[start] -= 1;
                    delta[end + 1] += 1;

                }

            }


            int[] prefix = new int[n];
            int shift = 0;
            for(int i=0; i<n; i++){
                shift += delta[i];
                prefix[i] = shift;
            }

            char[] ch = s.toCharArray();
            for(int i=0; i<n; i++){
                int netShift = (ch[i] - 'a' + prefix[i]) % 26;
                if(netShift < 0) netShift += 26;
                ch[i] = (char) ('a' + netShift);
            }



            return new String(ch);
        }

    }
}
