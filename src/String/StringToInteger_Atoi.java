package String;

public class StringToInteger_Atoi {

    class Solution {
        public int myAtoi(String s) {

            int n = s.length();
            int i = 0;

            while(i < n && s.charAt(i) == ' '){
                i++;
            }

            int sign = 1;
            if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
                sign = s.charAt(i) == '-' ? -1 : 1;
                i++;
            }

            int result = 0;
            while(i < n && Character.isDigit(s.charAt(i))){
                int digit = s.charAt(i) - '0';

                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
                i++;
            }


            return result * sign;
        }
    }
}
