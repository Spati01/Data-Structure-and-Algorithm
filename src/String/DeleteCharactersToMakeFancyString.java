package String;

public class DeleteCharactersToMakeFancyString {

    class Solution {
        public String makeFancyString(String s) {
            return  removeThreeConsecutive(s);

        }

        private String removeThreeConsecutive(String str){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int i=0; i<str.length(); i++){
                if(i > 0 && str.charAt(i) == str.charAt(i-1)){
                    count++;
                }else{
                    count = 1;
                }
                if(count < 3){
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }
    }


}
