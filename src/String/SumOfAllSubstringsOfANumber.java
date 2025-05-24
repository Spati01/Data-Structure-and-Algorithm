package String;

public class SumOfAllSubstringsOfANumber {

    class Solution {
        public static int sumSubstrings(String s) {
            int sum = 0;
            for(int i=0; i<s.length(); i++){
                String str = "";
                for(int j=i; j<s.length(); j++){
                    str += s.charAt(j);
                    sum += Integer.parseInt(str);
                }
            }
            return sum;
        }
    }
}
