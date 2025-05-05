package Searching;

import java.sql.Time;
import java.util.HashMap;

public class SearchInAnAlmostSortedArray {


  /*  Time : O(log n)  Space O(1)  */

    // User function Template for Java
    class Solution {
        public int findTarget(int arr[], int target) {

            int low = 0;
            int high = arr.length - 1;


            while(low <= high){
                int mid = low + (high - low)/2;

                if(arr[mid] == target)return mid;
                if(mid - 1 >= low && arr[mid - 1] == target)return mid - 1;
                if(mid + 1 <= high && arr[mid + 1] == target) return mid + 1;

                if(arr[mid] < target){

                    low = mid + 2;

                }else {
                    high = mid - 2;

                }
            }
            return -1;


        }
    }


    /* Time : O(n)  Space O(1) */

    class Solver {
        public int findTarget(int arr[], int target) {


            for(int i=0; i<arr.length; i++){
                if(arr[i] == target)return i;
            }
            return -1;

        }
    }

             /* Using space--
             *  Time : O(n)  Space O(N)   */


    class Problem {
        public int findTarget(int arr[], int target) {
            // code here

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<arr.length; i++){
                map.put(arr[i], i);
            }
            return map.containsKey(target) ? map.get(target) : -1;
        }
    }
}
