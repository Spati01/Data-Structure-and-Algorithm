package Matrix;

public class MaximumMatrixSum {

    class Solution {
        public long maxMatrixSum(int[][] matrix) {

            int row = matrix.length;
            int col = matrix[0].length;


            long sum = 0;
            Long min = Long.MAX_VALUE;
            int neg = 0;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    int value = matrix[i][j];
                    sum += Math.abs(value);
                    if(value < 0){
                        neg++;
                    }
                    min = Math.min(min, Math.abs(value));
                }


            }


            if(neg % 2 != 0){
                sum -= 2 * min;
            }
            return sum;
        }
    }

}
