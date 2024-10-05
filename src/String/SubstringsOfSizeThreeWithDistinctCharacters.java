package String;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    class Solution {
        public int countGoodSubstrings(String s) {
            int n = s.length();
            if(n < 3) return 0;
            char a = s.charAt(0),b = s.charAt(1), c = s.charAt(2);
            int count = 0;

            for(int i=3; i<n; i++){
                if(a != b && b != c && c != a) count++;

                a = b;
                b = c;
                c = s.charAt(i);
            }
            if(a != b && b != c && c != a) count++;

            return count;
        }

    }

}
