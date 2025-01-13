package Arrays;

public class ContainerWithMostWater {


    class Solution {

        public int maxWater(int arr[]) {
            // Code Here
            int n = arr.length;
            int max = 0;

            int i = 0;
            int j = n-1;

            while(i < j){
                if(arr[i] < arr[j]){
                    int dis = j - i;
                    int min = Math.min(arr[i], arr[j]);
                    max = Math.max(max, dis * min);
                    i++;
                }else{
                    int dis = j - i;
                    int min = Math.min(arr[i], arr[j]);
                    max = Math.max(max, dis * min);
                    j--;

                }

            }

            return max;

        }
    }
}
