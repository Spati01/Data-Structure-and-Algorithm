package Arrays;

import java.util.Set;
import java.util.TreeSet;

public class Finding3DigitEvenNumbers {

    class Solution {
        public int[] findEvenNumbers(int[] digits) {

            int n = digits.length;

            Set<Integer> set = new TreeSet<>();
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(j == i)continue;

                    for(int k=0; k<n; k++){
                        if(k == i || k == j)continue;

                        int d1 = digits[i];
                        int d2 = digits[j];
                        int d3 = digits[k];

                        if(d1 == 0)continue;
                        if (d3 % 2 != 0) continue;

                        int num = d1 * 100 + d2 * 10 + d3;
                        set.add(num);
                    }
                }
            }

            int[] result = new int[set.size()];
            int idx = 0;
            for(int i : set){
                result[idx++] = i;
            }
            return result;

        }
    }
}
