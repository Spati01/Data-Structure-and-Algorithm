package Arrays;

import java.util.ArrayList;
import java.util.TreeMap;

public class MyCalendarII {


    class MyCalendarTwo {
        ArrayList<int[]> booking;
        TreeMap<Integer, Integer> overlap;
        public MyCalendarTwo() {
            this.booking = new ArrayList<>();
            this.overlap = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            Integer preVal = overlap.lowerKey(end);
            if(preVal != null && start <= overlap.get(preVal) - 1){
                return false;
            }

            for(int[] event : booking){
                int commonStart = Math.max(event[0], start);
                int commonEnd = Math.min(event[1], end);

                if(commonStart < commonEnd){
                    overlap.put(commonStart, commonEnd);
                }
            }

            booking.add(new int[]{start, end});

            return true;
        }
    }

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
}
