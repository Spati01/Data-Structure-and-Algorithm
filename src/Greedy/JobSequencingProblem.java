package Greedy;

import java.util.PriorityQueue;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}



public class JobSequencingProblem {


    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (x, y) -> x.deadline - y.deadline);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            if(arr[i].deadline > pq.size()) pq.add(arr[i].profit);
            else if(arr[i].deadline == pq.size()){
                if(arr[i].profit > pq.peek()){
                    pq.poll();
                    pq.add(arr[i].profit);
                }
            }
        }
        int totalProfit = 0;
        int c = pq.size();
        int[] ans = new int[2];
        while(!pq.isEmpty()) totalProfit += pq.poll();

        ans[0] = c;
        ans[1] = totalProfit;

        return ans;
    }
}
