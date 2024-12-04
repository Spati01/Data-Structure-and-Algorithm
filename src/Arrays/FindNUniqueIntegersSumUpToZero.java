package Arrays;

public class FindNUniqueIntegersSumUpToZero {


    class Solution {
        public int[] sumZero(int n) {

            int[] arr = new int[n];

            int start = 0;
            int end = n-1;

            int temp = n / 2;

            while(start <= end){
                arr[start] = -temp;
                arr[end] = temp;
                temp--;
                start++;
                end--;
            }

            return arr;
        }
    }



}
