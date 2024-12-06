package Arrays;

import java.util.*;

public class FindHIndex {

    class Solution {
        // Function to find hIndex
        public int hIndex(int[] citations) {
            // code here
            Arrays.sort(citations);

            int n = citations.length;

            int H_index = 0;

            while (H_index < n && citations[n - 1 - H_index] > H_index) {
                H_index++;
            }

            return H_index;
        }
    }
}
