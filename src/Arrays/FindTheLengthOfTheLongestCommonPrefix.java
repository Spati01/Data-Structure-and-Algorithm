package Arrays;

import java.util.HashSet;

public class FindTheLengthOfTheLongestCommonPrefix {

    class Solution {
        public int longestCommonPrefix(int[] arr1, int[] arr2) {
            HashSet<Integer> set = new HashSet<>();
            int max = 0;
            for(int val : arr1){
                while(val > 0){
                    set.add(val);
                    val /= 10;
                }
            }


            for(int num : arr2){
                while(num > 0){
                    if(set.contains(num)){
                        max = Math.max(max, String.valueOf(num).length());
                        break;
                    }

                    num /= 10;

                }
            }
            return max;
        }
    }



}
