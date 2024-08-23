package Arrays;
import java.util.*;
public class MaxValuePermutation {

    int Maximize(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        long val = 0;
        for(int i=0; i<arr.length; i++){
            val += (long) arr[i] * i;
        }
        return (int) (val % (1000000007)) ;
    }
}
