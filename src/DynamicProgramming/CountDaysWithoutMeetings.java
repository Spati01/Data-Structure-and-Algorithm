package DynamicProgramming;

import java.util.*;


public class CountDaysWithoutMeetings {

    class Solution {
        public int countDays(int days, int[][] meetings) {
            Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

            int occupiedDays = 0;
            int lastEnd = 0;

            for(int[] meeting : meetings){
                int start = meeting[0];
                int end = meeting[1];

                if(start > lastEnd){
                    occupiedDays += (end - start + 1);
                }else if(end > lastEnd){
                    occupiedDays += (end - lastEnd);
                }

                lastEnd = Math.max(lastEnd , end);
            }

            return days - occupiedDays;
        }
    }
}
