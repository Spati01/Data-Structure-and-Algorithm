package Matrix;

public class RowWithMax1s {


    class Solution {
        public int rowWithMax1s(int arr[][]) {
            // code here

            int n = arr.length;
            int m = arr[0].length;

            //  int[] count = new int[n];

            int maxCount = Integer.MIN_VALUE;
            int maxIdx =  Integer.MIN_VALUE;

            for(int i=0; i<n; i++){
                int count = 0;
                for(int j=0; j<m; j++){
                    if(arr[i][j] == 1){
                        count++;
                    }

                }

                if(count > maxCount){
                    maxCount = count;
                    maxIdx = i;
                }



            }

            return maxIdx;


        }
    }


// Time Complexity is O(N * log m)
// Space Complexity is O(1)


    class Solution1 {
        public int rowWithMax1s(int arr[][]) {

            int n = arr.length;
            int m = arr[0].length;
            // code here
            int maxOne = Integer.MIN_VALUE;
            int maxIdx = Integer.MIN_VALUE;

            for(int i=0; i<n; i++){

                int count = m - isCheck(arr[i], m, 1);
                if(count > maxOne){
                    maxOne = count;
                    maxIdx = i;
                }
            }

            return maxIdx;

        }


        private int isCheck(int[] arr, int n, int x){

            int low = 0;
            int high = n - 1;

            int ans = n;

            while(low <= high){
                int mid = low +(high - low) / 2;
                if(arr[mid] >= x){
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
