package HashMapHashSet;

import java.util.HashSet;

public class CountDistinctNumbersOnBoard {

// First Solution

// class Solution {
//     public int distinctIntegers(int n) {
//         return n==1 ? 1 : n-1;
//     }
// }



// Second Solution
    class Solution {
        public int distinctIntegers(int n) {
            HashSet<Integer> set = new HashSet<>();
            int count=0;
            while(n > 0){
                for(int i=1; i<n; i++){
                    if(n % i ==1){
                        set.add(n);
                    }
                }

                n--;
            }
            return set.size() + 1;
        }
    }



}
