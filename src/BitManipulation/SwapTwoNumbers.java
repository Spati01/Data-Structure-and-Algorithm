package BitManipulation;

import java.util.List;
import java.util.*;

public class SwapTwoNumbers {

    class Solution{
        static List<Integer> get(int a, int b)
        {
            // code here

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            return Arrays.asList(a,b);



        }
    }
}
