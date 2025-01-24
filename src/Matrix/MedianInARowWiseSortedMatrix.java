package Matrix;

public class MedianInARowWiseSortedMatrix {

    class Solution {
        int median(int mat[][]) {
            // code here
            int m = mat.length;
            int n = mat[0].length;

            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;

            for(int i=0; i<m; i++){
                low = Math.min(low, mat[i][0]);
                high = Math.max(high, mat[i][n-1]);
            }

            int req = (n * m) / 2;

            while(low <= high){
                int mid = low + (high - low) / 2;

                int equal = countEqual(mat, m, n, mid);

                if(equal <= req){

                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }

            return low;
        }

        private int countEqual(int[][] mat, int m, int n, int x){

            int count = 0;

            for(int i=0; i<m; i++){
                count += midMatrix(mat[i], n, x);
            }

            return count;
        }


        private int midMatrix(int[] arr, int n, int x){

            int low = 0;
            int high = n - 1;

            int ans = n;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(arr[mid] > x){
                    ans = mid;
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }

            return ans;
        }

    }

}
