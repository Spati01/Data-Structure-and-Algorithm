package Arrays;

import java.util.Comparator;
import java.util.*;

public class CountNumberOfTrapezoidsI {
    class Solution {
        public int countTrapezoids(int[][] points) {

            int n = points.length;
            int mod = 1000000007;
            Arrays.sort(points, Comparator.comparing(a -> a[1]));
            long res = 0;
            long total = 0;

            for(int i=0, j; i<n; i = j){
                j = i + 1;

                while(j < n && points[i][1] == points[j][1]){
                    j++;
                }

                long count = j - i;
                long lines = count * (count -  1) / 2;
                res = (res + total * lines) % mod;
                total = (total + lines) % mod;
            }

            return (int)res;
        }
    }
}
