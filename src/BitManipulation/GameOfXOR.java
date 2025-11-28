package BitManipulation;

public class GameOfXOR {

    public int subarrayXor(int[] arr) {
        // code here

        int xor = 0;


        for(int i=0; i<arr.length; i+=2){
            xor ^= arr[i];
        }

        return arr.length % 2 == 0 ? 0 : xor;
    }
}
}
