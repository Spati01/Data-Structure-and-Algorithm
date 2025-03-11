package String;

public class PalindromeSubStrings {



    class Solution {
        public int countPS(String s) {
            // code here

            int count = 0;
            int n = s.length();

            for(int i=0; i<n; i++){
                count += countPalindrom(s,i,i);
                count += countPalindrom(s, i, i+1);
            }

            return count;

        }

        private int countPalindrom(String s, int i, int j){
            int count = 0;
            while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){

                if(j-i+1 >= 2){
                    count++;
                }

                i--;
                j++;
            }

            return count;
        }
    }
}
