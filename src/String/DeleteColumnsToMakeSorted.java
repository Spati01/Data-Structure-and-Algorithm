package String;

public class DeleteColumnsToMakeSorted {

    class Solution {
        public int minDeletionSize(String[] strs) {
            int ans = 0;

            for(int col = 0; col<strs[0].length(); col++){
                for(int row = 1; row<strs.length; row++){
                    if(strs[row].charAt(col) < strs[row-1].charAt(col)){
                        ans++;
                        break;
                    }
                }
            }

            return ans;
        }
    }
}
