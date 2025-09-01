package Queue;

import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {

        PriorityQueue<double[]> maxHeap =  new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for(int[] cla : classes){
            int pass = cla[0];
            int fail = cla[1];

            double improve = improvement(pass, fail);
            maxHeap.offer(new double[]{improve, pass, fail});
        }

        while(extraStudents > 0){
            double[] top = maxHeap.poll();
            int pass = (int) top[1];
            int fail = (int) top[2];

            pass++;
            fail++;
            extraStudents--;

            double newImprove = improvement(pass, fail);
            maxHeap.offer(new double[]{newImprove, pass, fail});
        }

        double totalRatio = 0.0;
        while(!maxHeap.isEmpty()){
            double[] claz = maxHeap.poll();
            int pass = (int) claz[1];
            int fail = (int) claz[2];

            totalRatio += (double) pass / fail;
        }

        return totalRatio / classes.length;
    }

    private double improvement(int pass, int total){
        return ((double) (pass + 1) / (total +  1)) - ((double) pass / total);
    }
}