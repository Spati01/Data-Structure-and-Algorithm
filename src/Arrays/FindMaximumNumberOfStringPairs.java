package Arrays;

public class FindMaximumNumberOfStringPairs {


    class Solution {
        public int maximumNumberOfStringPairs(String[] words) {

            int count = 0;
            for(int i=0; i<words.length; i++){
                for(int j=i+1; j<words.length; j++){
                    if(words[i].equals(reverse(words[j]))){
                        count++;
                    }
                }
            }
            return count;

        }



        private String reverse(String str){
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }
    }
}
