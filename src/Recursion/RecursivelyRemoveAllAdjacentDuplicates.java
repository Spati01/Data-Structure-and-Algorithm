package Recursion;

public class RecursivelyRemoveAllAdjacentDuplicates {

    String rremove(String s) {
        // code here
        String str = "";
        while(s.length() != str.length()){
            str = s;
            s = get(s);
        }
        return s;
    }

    private String get(String s){
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n){
            if(i < n-1 && s.charAt(i)  == s.charAt(i+1)){
                while(i < n-1 && s.charAt(i)  == s.charAt(i+1)){
                    i++;
                }
            }else{
                sb.append(s.charAt(i));
            }
            i++;

        }
        return sb.toString();


    }
}
