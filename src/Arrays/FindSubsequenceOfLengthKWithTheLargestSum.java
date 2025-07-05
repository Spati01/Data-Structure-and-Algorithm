package Arrays;

import java.util.Comparator;

import java.util.*;

public class FindSubsequenceOfLengthKWithTheLargestSum {

    class Solution {
        public int[] maxSubsequence(int[] nums, int k) {


            int n = nums.length;
            int[][] indexed = new int[n][2];

            for(int i=0; i<n; i++){
                indexed[i][0] = nums[i];
                indexed[i][1] = i;
            }

            Arrays.sort(indexed, (a,b) -> b[0] - a[0]);
            int[][] topk = Arrays.copyOfRange(indexed, 0, k);

            Arrays.sort(topk, Comparator.comparingInt(a -> a[1]));

            int[] result = new int[k];
            for(int i=0; i<k; i++){
                result[i] = topk[i][0];
            }

            return result;

        }
    }
}
