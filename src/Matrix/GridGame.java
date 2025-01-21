package Matrix;

public class GridGame {

    class Solution {
        public long gridGame(int[][] grid) {
            int col = grid[0].length;
            long top = 0;
            for(int i=0; i<col; i++){
                top += grid[0][i];
            }

            long bottom = 0;
            long result = Long.MAX_VALUE;

            for(int i=0; i<col; i++){
                top -= grid[0][i];
                result = Math.min(result, Math.max(top, bottom));
                bottom += grid[1][i];
            }

            return result;
        }
    }
}
