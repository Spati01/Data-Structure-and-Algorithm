package Arrays;

import java.util.HashMap;

public class FindThePrefixCommonArrayOfTwoArrays {

    class Solution {
        public int[] findThePrefixCommonArray(int[] A, int[] B) {
            int n = A.length;
            int[] ans = new int[n];
            HashMap<Integer, Integer> freq = new HashMap<>();

            for(int i=0; i<n; i++){
                if(freq.containsKey(A[i])){
                    freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
                }else{
                    freq.put(A[i], 1);
                }

                if(freq.containsKey(B[i])){

                    freq.put(B[i], freq.getOrDefault(B[i], 0) + 1);
                }else{
                    freq.put(B[i], 1);
                }


                int count = 0;
                for(int key : freq.values()){
                    if(key  == 2){
                        count++;
                    }
                    ans[i] = count;
                }


            }

            return ans;

        }
    }

    class Solution1 {
        public int[] findThePrefixCommonArray(int[] A, int[] B) {

            int n = A.length;

            int[] freq = new int[n+1];
            int[] result = new int[n];
            int count = 0;
            for(int i=0; i<n; i++){
                freq[A[i]]++;
                if(freq[A[i]] == 2)count++;

                freq[B[i]]++;
                if(freq[B[i]] == 2)count++;

                result[i] = count;
            }
            return result;

        }
    }
}
