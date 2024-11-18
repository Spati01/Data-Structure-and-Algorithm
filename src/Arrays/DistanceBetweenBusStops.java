package Arrays;

public class DistanceBetweenBusStops {


    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int dest) {

            if(start > dest){
                int temp = start;
                start = dest;
                dest = temp;
            }

            int totalDistance = 0;
            for(int dis : distance){
                totalDistance += dis;
            }
            int clockwise = 0;
            for(int i=start; i<dest; i++){
                clockwise += distance[i];
            }

            int antiClockwise = totalDistance - clockwise;

            return Math.min(antiClockwise, clockwise);
        }
    }
}
