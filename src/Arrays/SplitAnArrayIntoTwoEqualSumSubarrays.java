package Arrays;

public class SplitAnArrayIntoTwoEqualSumSubarrays {



        public boolean canSplit(int arr[]) {
            // code here
            int n = arr.length;
            int[] suffix = new int[n];
            int sum = 0;
            for(int i=n-1; i>0; i--){
                sum += arr[i];
                suffix[i] = sum;
            }


            sum = 0;
            for(int i=0; i<n-1; i++){
                sum += arr[i];
                if(sum == suffix[i+1]){
                    return true;
                }
            }
            return false;
        }
    }



