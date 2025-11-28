package BitManipulation;

import java.util.ArrayList;

public class SubsetXOR {

    public static ArrayList<Integer> subsetXOR(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int xor = 0;


        for(int i=1; i<=n; i++){
            xor ^= i;
            list.add(i);
        }

        if(xor == n)return list;
        else{

            list.remove(Integer.valueOf(xor ^ n));
            return list;
        }


    }
}
