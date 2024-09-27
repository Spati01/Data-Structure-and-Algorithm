package BitManipulation;

import java.util.ArrayList;

public class RotateBits {


    class Solution
    {

        ArrayList<Integer> rotate(int N, int D)
        {
            // your code here
            ArrayList<Integer> list = new ArrayList<>();

            int bitLength = 16;

            D %= bitLength;


            int left = (N << D) | (N >> (bitLength - D));
            int right = (N >> D) | (N << bitLength - D);


            left =  left & ((1 << bitLength) - 1);
            right = right & ((1 << bitLength) - 1);



            list.add(left);
            list.add(right);

            return list;
        }
    }
}
