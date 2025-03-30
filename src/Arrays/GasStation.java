package Arrays;

public class GasStation {



    class Solution {
        public int startStation(int[] gas, int[] cost) {
            // Your code here

            int position = 0;
            int sum = 0;
            int total = 0;

            for(int i=0; i<gas.length; i++){


                sum += gas[i] - cost[i];


                if(sum < 0){
                    total += sum;
                    position = i + 1;
                    sum = 0;
                }

            }

            total += sum;

            return total >= 0 ? position : -1;
        }
    }
}
