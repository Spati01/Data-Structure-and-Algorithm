package String;

public class StringCompressionIII {

    class Solution {
        public String compressedString(String word) {
            StringBuilder sb = new StringBuilder();
            int n = word.length();
            int i = 0;
            while(i < n){
                char ch = word.charAt(i);
                int count = 0;
                while(i < n && word.charAt(i) == ch && count < 9){

                    count++;
                    i++;
                }
                sb.append(count).append(ch);
            }
            return sb.toString();
        }
    }
}
