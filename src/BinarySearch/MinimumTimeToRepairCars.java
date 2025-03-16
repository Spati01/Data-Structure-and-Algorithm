package BinarySearch;


import java.util.Arrays;

public class MinimumTimeToRepairCars {

    class Solution {
        public long repairCars(int[] ranks, int cars) {

            long left = 0;
            long right = (long) Arrays.stream(ranks).max().getAsInt() * cars * cars;

            while(left < right){
                long mid = left + (right - left) / 2;
                if(minimumTimeTaken(ranks, cars, mid)){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }

            return left;
        }

        private boolean minimumTimeTaken(int[] ranks, int cars, long time){

            long totalCarsRepair = 0;
            for(int rank : ranks){
                totalCarsRepair += Math.sqrt(time / rank);
            }


            return totalCarsRepair >= cars;
        }
    }
}
