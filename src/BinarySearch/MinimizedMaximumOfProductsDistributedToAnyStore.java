package BinarySearch;

public class MinimizedMaximumOfProductsDistributedToAnyStore {

    class Solution {
        public int minimizedMaximum(int n, int[] quant) {
            int start = 1;
            int end = Integer.MIN_VALUE;

            for(int i=0; i<quant.length; i++){
                if(quant[i] > end){
                    end = quant[i];
                }
            }
            int res = -1;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(Distribute(quant, mid, n)){
                    res = mid;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return res;
        }
        private boolean Distribute(int[] quant, int maxProduct, int score){
            int scoreCount = 0;
            for(int i=0; i<quant.length; i++){
                scoreCount += quant[i] / maxProduct;
                if(quant[i] % maxProduct != 0){
                    scoreCount++;
                }
                if(scoreCount  > score){
                    return false;
                }
            }
            return true;
        }
    }
}
