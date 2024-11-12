package Arrays;
import java.util.*;


public class MeetingRooms {



    class Solution {
        static boolean canAttend(int[][] arr) {
            // Your code here

            Arrays.sort(arr, (a, b)-> Integer.compare(a[0] , b[0]));
            for(int i=1; i<arr.length; i++){

                if(arr[i][0] < arr[i-1][1]){
                    return false;
                }

            }
            return true;

        }
    }
}