package Math;

public class PalindromeNumber {

    class Solution {
        public boolean isPalindrome(int x) {
            String str = String.valueOf(x);

            int i=0;
            int j = str.length()-1;

            if(str.length() == 1) return true;

            while(i < j){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }



}