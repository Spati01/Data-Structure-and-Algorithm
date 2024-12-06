package HashMapHashSet;

import java.util.HashSet;

public class SmallestPositiveMissingNumber {


    class Solution {
        // Function to find the smallest positive number missing from the array.
        public int missingNumber(int[] arr) {
            // Your code here

            HashSet<Integer> set = new HashSet<>();

            for(int num : arr){
                set.add(num);
            }

            int i = 1;
            while(set.contains(i)){
                i++;
            }
            return i;
        }
    }
}
