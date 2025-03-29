package DynamicProgramming;


import java.util.*;



public class JobSequencingProblem {


    class Solution {

        class Job {
            int deadline, profit;


            Job(int deadline, int profit) {
                this.deadline = deadline;
                this.profit = profit;
            }
        }
        public ArrayList<Integer> jobSequencing(int[] d, int[] p) {
            // code here

            int n = d.length;
            Job[] arr = new Job[n];
            for(int i=0; i<n; i++){
                arr[i] = new Job(d[i], p[i]);
            }

            Arrays.sort(arr, (a,b) -> b.profit - a.profit);

            int maxJobDeadLine = 0;
            for(Job a : arr){
                maxJobDeadLine = Math.max(maxJobDeadLine, a.deadline);
            }

            int[] fillTime = new int[maxJobDeadLine];
            Arrays.fill(fillTime, -1);
            int profit = 0, jobsDone = 0;

            for (Job a : arr) {
                for (int i = a.deadline - 1; i >= 0; i--) {
                    if (fillTime[i] == -1) {
                        fillTime[i] = i;
                        profit += a.profit;
                        jobsDone++;
                        break;
                    }
                }
            }

            return new ArrayList<>(Arrays.asList(jobsDone, profit));
        }
    }
}
