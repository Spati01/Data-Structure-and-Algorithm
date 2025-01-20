package Matrix;

import java.util.HashMap;
import java.util.Map;

public class FirstCompletelyPaintedRowOrColumn {

    class Solution {
        public int firstCompleteIndex(int[] arr, int[][] mat) {

            int m = mat.length;
            int n = mat[0].length;

            Map<Integer, int[]> map = new HashMap<>();

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    map.put(mat[i][j], new int[]{i, j});
                }
            }

            int[] rowFreq = new int[m];
            int[] colFreq = new int[n];

            for(int i=0; i<m * n; i++){

                int val = arr[i];
                int[] pos = map.get(val);
                int row = pos[0];
                int col = pos[1];

                rowFreq[row]++;
                colFreq[col]++;

                if( rowFreq[row] == n || colFreq[col] == m){
                    return i;
                }
            }

            return -1;
        }
    }
}
