package String;

public class RotateString {
    class Solution {
        public boolean rotateString(String s, String goal) {

            for(int i=0; i<s.length(); i++){
                String  rotate = isRotate(s, i);
                if(rotate.equals(goal)){
                    return true;
                }
            }
            return false;
        }

        private String isRotate(String s, int k){

            k %= s.length();

            String part1 = s.substring(k);
            String part2 = s.substring(0, k);

            return part1 + part2;
        }
    }

    class Solution1 {
        public boolean rotateString(String s, String goal) {

            if(s.length() != goal.length())return false;

            return (s+s).contains(goal);
        }
    }
}
