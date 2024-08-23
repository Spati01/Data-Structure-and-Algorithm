package Arrays;

import java.util.List;

public class MaximumDistanceInArrays {

    public int maxDistance(List<List<Integer>> arrays) {

        int maxDistance = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        for(int i=1; i<arrays.size(); i++){
            List<Integer> array = arrays.get(i);

            int distanceMax = Math.abs(array.get(0) - max);

            int distanceMin = Math.abs(array.get(array.size() - 1) - min);

            maxDistance = Math.max(maxDistance, Math.max(distanceMax, distanceMin));

            min = Math.min(min, array.get(0));
            max = Math.max(max, array.get(array.size() - 1));


        }
        return maxDistance;
    }

}
