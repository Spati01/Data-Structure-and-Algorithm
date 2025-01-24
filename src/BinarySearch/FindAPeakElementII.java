package BinarySearch;

public class FindAPeakElementII {


    class Solution {
        public int[] findPeakGrid(int[][] mat) {

            int n = mat.length;
            int m = mat[0].length;


            int low = 0;
            int high = m - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;
                int row = isRow(mat, mid, n, m);
                int left = mid-1 >= 0 ? mat[row][mid-1] : -1;
                int right = mid+1 < m ? mat[row][mid+1] : -1;

                if(mat[row][mid] > left && mat[row][mid] > right){
                    return new int[]{row, mid};
                }else if(mat[row][mid] < left){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }

            return new int[]{-1, -1};
        }

        private int isRow(int[][] mat, int row, int n, int m){

            int maxValue = -1;
            int idx = -1;

            for(int i=0; i<n; i++){
                if(mat[i][row] > maxValue){
                    maxValue = mat[i][row];
                    idx = i;
                }
            }
            return idx;

        }
    }
}
