package Arrays;

public class KokoEatingBananas {

    class Solution {
        public int minEatingSpeed(int[] piles, int h) {

            int n =piles.length;
            int l = 1;
            int r = Integer.MIN_VALUE;

            for(int i : piles){
                r = Math.max(r, i);
            }
            int ans = -1;
            while(l <= r){
                int mid = l + (r - l) / 2;
                if(isEatingSpeed(piles, mid, h)){
                    ans = mid;
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }

            }
            return ans;


        }

        private boolean isEatingSpeed(int[] pils, int speedTime, int hours){
            int hoursSpent = 0;
            for(int i=0; i<pils.length; i++){
                hoursSpent += pils[i] / speedTime;
                if(pils[i] % speedTime != 0){
                    hoursSpent++;
                }

                if(hoursSpent > hours)return false;
            }

            return true;
        }
    }
}
