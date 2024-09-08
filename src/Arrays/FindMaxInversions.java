package Arrays;

import java.util.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaxInversions {

    public static int findswaps(int n, int[] arr) {
        // code here


        // Create a copy of the array and sort it in descending order
        Integer[] sortedArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr, Collections.reverseOrder());

        // Create a map from value to its index in the sorted array
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valueToIndex.put(sortedArr[i], i);
        }

        // Create an array to keep track of visited elements
        boolean[] visited = new boolean[n];
        int minSwaps = 0;

        // Traverse each element and count the cycles
        for (int i = 0; i < n; i++) {
            if (visited[i] || valueToIndex.get(arr[i]) == i) {
                continue;
            }

            // Compute the size of the cycle
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = valueToIndex.get(arr[j]);
                cycleSize++;
            }

            // If the cycle size is greater than 1, add (cycleSize - 1) to swap count
            if (cycleSize > 1) {
                minSwaps += (cycleSize - 1);
            }
        }

        return minSwaps;
    }
}
