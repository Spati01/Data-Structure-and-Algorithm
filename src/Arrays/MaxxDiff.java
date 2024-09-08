package Arrays;

import java.util.*;

public class MaxxDiff {
    public static long fndMax(int n, int m, int[] arr1, int[] arr2) {
        // code here

        Arrays.sort(arr1);

        // Sort arr2 in descending order
        Arrays.sort(arr2);
        int[] arr2Desc = new int[m];
        for (int i = 0; i < m; i++) {
            arr2Desc[i] = arr2[m - 1 - i];
        }

        // Two pointers to track elements from both arrays
        int startA = 0, endA = n - 1;
        int startB = 0, endB = m - 1;

        long totalSum = 0;

        while (startA <= endA && startB <= endB) {
            if (Math.abs(arr1[startA] - arr2Desc[startB]) > Math.abs(arr1[endA] - arr2Desc[endB])) {
                totalSum += Math.abs(arr1[startA] - arr2Desc[startB]);
                startA++;
                startB++;
            } else {
                totalSum += Math.abs(arr1[endA] - arr2Desc[endB]);
                endA--;
                endB--;
            }
        }

        return totalSum;
    }
}