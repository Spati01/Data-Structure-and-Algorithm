package Arrays;

public class MinimumCostToMoveChipsToTheSamePosition {

    class Solution {
        public int minCostToMoveChips(int[] position) {

            int odd = 0;
            int even = 0;

            for(int i : position){
                if(i % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }

            return even == position.length || odd == position.length ? 0 : Math.min(odd, even);

        }
    }





}
