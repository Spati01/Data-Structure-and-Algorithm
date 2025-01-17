package BitManipulation;

public class NeighboringBitwiseXOR {

    class Solution {
        public boolean doesValidArrayExist(int[] derived) {

            //int[] orginal = new int[derived.length];
            int xor = 0;
            for(int i=0; i<derived.length; i++){
                xor ^= derived[i];
            }

            return (xor == 0);
        }
    }
}
