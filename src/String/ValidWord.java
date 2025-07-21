package String;

public class ValidWord {

    class Solution {
        public boolean isValid(String word) {

            int n = word.length();
            if(n < 3)return false;

            int vowel = 0;
            int consonent = 0;

            for(char ch : word.toCharArray()){
                if(Character.isLetter(ch)){
                    if("aeiouAEIOU".indexOf(ch) != -1){
                        vowel++;
                    }else{
                        consonent++;
                    }
                } else if(!Character.isDigit(ch))return false;
            }


            return vowel >= 1 && consonent >= 1;
        }
    }
}
