package Arrays;

import java.util.ArrayList;

public class MyCalendarI {


    class MyCalendar {
        ArrayList<int[]> booking;
        public MyCalendar() {
            this.booking = new ArrayList<>();
        }

        public boolean book(int start, int end) {

            for(int[] event : booking){
                int exitStart = event[0];
                int exitEnd = event[1];

                if(start < exitEnd && exitStart < end){
                    return false;
                }
            }
            booking.add(new int[]{start, end});

            return true;

        }
    }

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
}
