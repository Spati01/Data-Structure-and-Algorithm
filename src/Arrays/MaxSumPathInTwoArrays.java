package Arrays;

import java.util.List;

public class MaxSumPathInTwoArrays {

    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int m = arr1.size();
        int n = arr2.size();

        int part1 = 0;
        int part2 = 0;

        int sum1 = 0;
        int sum2 = 0;

        int maxSum = 0;


        while(part1 < m && part2 < n){
            int x = arr1.get(part1);
            int y = arr2.get(part2);

            if(x != y){
                if(x > y){
                    sum2 += y;
                    part2++;
                }else{
                    sum1 += x;
                    part1++;

                }
            }else{


                sum1 += x;
                sum2 += y;

                maxSum += Math.max(sum1, sum2);
                sum1 = sum2 =0;
                part1++;
                part2++;
            }
        }

        while(part1 < m){
            sum1 += arr1.get(part1++);
        }
        while(part2 < n){
            sum2 += arr2.get(part2++);
        }

        maxSum += Math.max(sum1, sum2);
        return maxSum;
    }

}
