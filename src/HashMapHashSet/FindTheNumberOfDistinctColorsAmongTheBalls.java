package HashMapHashSet;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    class Solution {
        public int[] queryResults(int limit, int[][] queries) {

            int n = queries.length;

            int[] result = new int[n];

            Map<Integer,Integer> ballToColor = new HashMap<>();
            Map<Integer, Integer> colorCount = new HashMap<>();


            for(int i=0; i<n; i++){
                int ball = queries[i][0];
                int color = queries[i][1];

                if(ballToColor.containsKey(ball)){
                    int oldColor = ballToColor.get(ball);
                    colorCount.put(oldColor, colorCount.get(oldColor) - 1);

                    if(colorCount.get(oldColor) == 0) colorCount.remove(oldColor);
                }
                ballToColor.put(ball, color);

                colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

                result[i] = colorCount.size();

            }

            return result;
        }
    }
}
