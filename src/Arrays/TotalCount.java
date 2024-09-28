package Arrays;

public class TotalCount {


    class Solution {
        int totalCount(int k, int[] arr) {
            // code here
            int count = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] % k == 0){
                    count += arr[i]/k;
                }else{
                    count += arr[i]/k + 1;
                }
            }
            return count;
        }
    }
}
