package BitManipulation;

public class OnebitandTwobitCharacters {

    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            int i = 0;
            while(i < bits.length){
                if(bits[i] == 1){
                    i += 2;
                }else{
                    if(i == bits.length-1){
                        return true;
                    }
                    i++;
                }
            }
            return false;
        }
    }
}
