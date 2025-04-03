package Arrays;

public class MaximumValueOfAnOrderedTripletII {


    class Solution {
        public long maximumTripletValue(int[] nums) {

            int n = nums.length;

            if(n < 3)return 0;

            int[] prefix = new int[n];
            prefix[0] = nums[0];
            for(int i=1; i<n; i++){
                prefix[i] = Math.max(prefix[i-1], nums[i]);
            }


            int[] suffix = new int[n];
            suffix[n-1] = nums[n-1];
            for(int i= n-2; i>=0; i--){
                suffix[i] = Math.max(suffix[i+1], nums[i]);
            }

            long maxtriplet = 0;

            for(int i=1; i<n-1; i++){
                long firstTeam = prefix[i-1] - nums[i];
                long thirdTeam = suffix[i+1];

                maxtriplet = Math.max(maxtriplet, firstTeam * thirdTeam);
            }

            return maxtriplet;
        }
    }
}
