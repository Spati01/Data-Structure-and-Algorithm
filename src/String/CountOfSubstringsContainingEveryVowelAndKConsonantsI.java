package String;

public class CountOfSubstringsContainingEveryVowelAndKConsonantsI {

    class Solution {
        public int countOfSubstrings(String word, int k) {
            int ans = 0;
            for(int i=0; i<word.length(); i++){
                int  a = 0,e = 0, ii =0, o = 0,u = 0, c= 0;
                for(int j=i; j<word.length(); j++){
                    if(word.charAt(j) == 'a'){
                        a++;
                    }
                    else if(word.charAt(j)== 'e'){
                        e++;
                    }
                    else if(word.charAt(j) == 'i'){
                        ii++;
                    }
                    else if(word.charAt(j) == 'o'){
                        o++;
                    }
                    else if(word.charAt(j) == 'u'){
                        u++;
                    }
                    else{
                        c++;
                    }

                    if(a > 0 && e > 0 && ii > 0 && o > 0 && u > 0 && c == k){
                        ans++;
                    }
                }
            }
            return ans;
        }
    }


}
