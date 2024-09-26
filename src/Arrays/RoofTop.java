package Arrays;

public class RoofTop {




    class Solution {
        // Function to find maximum number of consecutive steps
        // to gain an increase in altitude with each step.
        public int maxStep(int arr[]) {
            // Your code here
            int max =Integer.MIN_VALUE;
            int c = 0;
            int i=0;
            while(i < arr.length-1){
                if( arr[i] < arr[i+1]){
                    c++;
                }else{
                    if(c > max){
                        max = c;
                    }
                    c = 0;

                }
                i++;
            }


            if(c > max){
                max  = c;
            }

            return max;
        }
    }
}
