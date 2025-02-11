package String;

public class RemoveAllOccurrencesOfASubstring {

    class Solution {
        public String removeOccurrences(String s, String part) {

            StringBuilder sb = new StringBuilder(s);
            while(sb.indexOf(part) != -1){
                int startIndex = sb.indexOf(part);
                int endIndex = startIndex + part.length();
                sb.delete(startIndex, endIndex);
            }

            return sb.toString();
        }
    }


    class Solution1 {
        public String removeOccurrences(String s, String part) {

            while(s.contains(part))
                s = s.replaceFirst(part, "");
            return s;
        }
    }
}
