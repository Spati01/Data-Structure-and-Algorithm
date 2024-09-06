package Arrays;
import java.util.*;

public class MeanOfArrayAfterRemovingSomeElements {

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int remove = (int) (n * 0.05);
        double sum = 0;
        for(int i=remove; i<n-remove; i++){
            sum += arr[i];
        }
        int rim = n - 2 * remove;


        return sum / rim;
    }
}
