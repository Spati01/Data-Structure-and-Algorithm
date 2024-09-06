package Arrays;

public class KadaneAlgorithm {

    long maxSubarraySum(int[] arr) {
        int sum = arr[0];
        int con = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            con = Math.max(sum, con);
        }
        return con;

}
}
