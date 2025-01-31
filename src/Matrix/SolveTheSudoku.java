package Matrix;

public class SolveTheSudoku {

    public static void solveSudoku(int[][] mat){

        isSolver(mat);
    }
    private static boolean isSolver(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 0){
                    for(int c=1; c<=9; c++){
                        if(isValid(mat, i, j, c)){
                            mat[i][j] = c;
                            if(isSolver(mat)) return true;
                            else mat[i][j] = 0;
                        }
                    }

                    return  false;
                }
            }
        }

        return  true;
    }

    private static boolean isValid(int[][] mat, int row, int col,int c){

        for(int i=0; i<9; i++){
            if(mat[i][col] == c){
                return false;
            }
        }

        for(int i=0; i<9; i++){
            if(mat[row][i] == c){
                return false;
            }
        }

        int startRow = (3 * (row / 3));
        int startCol = (3 * (col / 3));

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(mat[startRow + i][startCol + j] == c)return false;
            }
        }

        return true;

    }

}
