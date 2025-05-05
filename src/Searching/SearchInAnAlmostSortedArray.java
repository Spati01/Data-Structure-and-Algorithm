package Searching;

public class SearchInAnAlmostSortedArray {

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
}
