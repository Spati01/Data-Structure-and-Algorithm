package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNonCoprimeNumbersInArray {

    class Solution {
        public List<Integer> replaceNonCoprimes(int[] nums) {

            List<Integer> list = new ArrayList<>();

            for(int num : nums){
                while(!list.isEmpty()){
                    int top = list.get(list.size() - 1);
                    int gcd = GCD(top, num);

                    if(gcd == 1){
                        break;
                    }
                    list.remove(list.size() - 1);
                    num =(top / gcd) * num;
                }
                list.add(num);
            }

            return list;

        }

        private int GCD(int a, int b){
            return b == 0 ? a : GCD(b, a%b);
        }


    }
}
