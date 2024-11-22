package Arrays;

import java.util.HashMap;

public class FlipColumnsForMaximumNumberOfEqualRows {

    class Solution {
        public int maxEqualRowsAfterFlips(int[][] matrix) {
            HashMap<String, Integer> map = new HashMap<>();
            for(int[] row : matrix){

                StringBuilder copy = new StringBuilder();
                StringBuilder flip = new StringBuilder();

                for(int i : row){
                    copy.append(i);
                    flip.append(1-i);
                }

                String value = copy.toString();
                String flipValue = flip.toString();

                map.put(value, map.getOrDefault(value, 0) + 1);
                map.put(flipValue, map.getOrDefault(flipValue, 0) + 1);

            }
            int ans = 0;
            for(int v : map.values()){
                ans = Math.max(ans, v);
            }
            return ans;
        }
    }


}
