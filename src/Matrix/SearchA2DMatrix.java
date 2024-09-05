package Matrix;

public class SearchA2DMatrix {

    class LinearSearch{

        public boolean searchMatrix(int[][] matrix, int target) {

            int row = matrix.length;
            int col = matrix[0].length;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
            return false;
        }

    }

    class BinarySearch{

        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix.length==0) return false;

            int n = matrix.length;
            int m = matrix[0].length;
            int lo=0;
            int hi = (n*m)-1;
            while(lo<=hi){
                int  mid = (lo+(hi-lo)/2);
                if(matrix[mid/m][mid%m] == target){
                    return true;
                }else if(matrix[mid/m][mid%m] < target){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
            return false;

        }

    }

}
