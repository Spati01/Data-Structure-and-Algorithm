package Matrix;

public class SetMatrixZeroes {

    class Solution {
        public void setZeroes(int[][] matrix) {

            int row = matrix.length;
            int col = matrix[0].length;

            if(row == 0)return;

            int rowo = -1,  colo = -1;

            for(int i=0; i<row; i++){
                if(matrix[i][0] == 0) colo = 0;

            }

            for(int i=0; i<col; i++){
                if(matrix[0][i] == 0) rowo = 0;
            }


            for(int i=1; i<row; i++){
                for(int j=1; j<col; j++){
                    if(matrix[i][j] == 0){
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            for(int i=1; i<row; i++){
                for(int j=1; j<col; j++){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }


            if(colo == 0){
                for(int i=0; i<row; i++){
                    matrix[i][0] = 0;

                }
            }

            if(rowo == 0){
                for(int j=0; j<col; j++){
                    matrix[0][j] = 0;
                }
            }

        }
    }
}
