package Arrays;

public class MinimumNumberOfDaysToMakeMBouquets {

    class Solution {

        private int[] findRange(int[] bloomDay){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0; i<bloomDay.length; i++){
                max = Math.max(max, bloomDay[i]);
                min = Math.min(min, bloomDay[i]);
            }

            return new int[]{min, max};
        }
        public int minDays(int[] bloomDay, int m, int k) {

            if((long) k * m > bloomDay.length) return -1;

            int[] range = findRange(bloomDay);

            int start = range[0];
            int end = range[1];
            int ans = 0;
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(isPossible(mid, k , m, bloomDay)){
                    ans = mid;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return ans;
        }

        private boolean isPossible(int minDay, int k, int m, int[] bloom){

            int count = 0;
            int total = 0;

            for(int i=0; i<bloom.length; i++){
                if(bloom[i] <= minDay){
                    count++;
                }else{
                    count = 0;
                }

                if(count == k){
                    total++;
                    count = 0;
                }

                if(total >= m) return true;
            }

            return false;
        }
    }
}
