package Arrays;

public class BestSightseeingPair {

    class Solution {
        public int maxScoreSightseeingPair(int[] values) {

            int iSite = values[0] + 0;

            int max = 0;

            for(int i=1; i<values.length; i++){
                max = Math.max(max, iSite + values[i] - i);
                iSite = Math.max(iSite, values[i] + i);
            }
            return max;
        }
    }
}
