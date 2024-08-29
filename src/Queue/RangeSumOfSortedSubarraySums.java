package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class RangeSumOfSortedSubarraySums {

    int mod = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long[] res = new long[nums.length+1];

        for(int i=0; i<nums.length; i++){
            res[i+1] = res[i] + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                long sum = res[j+1] - res[i];
                pq.add(sum);
            }
        }
        long result = 0;
        for(int i=1; i<=right; i++){
            if(i >= left){
                result = (result + pq.poll()) % mod;

            }else{
                pq.poll();
            }
        }
        return (int) result;
    }
}
