package Arrays;

public class ConvertOneDArrayIntoTwoDArray {
    public int[][] construct2DArray(int[] original, int m, int n) {

        if(m*n != original.length) return new int[0][0];
        int[][] origin = new int[m][n];
        for(int row = 0; row<m; row++){
            for(int col=0; col<n; col++){
                origin[row][col] = original[row * n + col];
            }
        }
        return origin;

    }


}
