package Matrix;

public class RotateBy90Degree {


    class GFG {
        static void rotate(int matrix[][]) {
            // Code Here

            int n = matrix.length;
            int m = matrix[0].length;

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    swap(matrix, i,j, j ,i);
                }
            }


            for(int i=0;i<n; i++){
                int low = 0;
                int high = n-1;

                while(low < high){
                    swap(matrix,i,low ,i,high);
                    low++;
                    high--;
                }
            }
        }
        private static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
            int temp = matrix[i1][j1];
            matrix[i1][j1] = matrix[i2][j2];
            matrix[i2][j2] = temp;
        }
    }




}
