package String;

public class MinimumDeletionsToMakeStringKSpecial {


    class Solution {
        public int minimumDeletions(String word, int k) {

            int[] result = new int[26];
            int minDle = Integer.MAX_VALUE;

            for(char ch : word.toCharArray()){
                result[ch - 'a']++;
            }

            for(int x : result){

                int count = 0;
                for(int a : result){
                    count += (a < x) ? a : Math.max(0, a -(x + k));
                }

                minDle = Math.min(minDle, count);
            }


            return minDle;
        }
    }
}
