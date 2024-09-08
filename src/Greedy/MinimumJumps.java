package Greedy;

public class MinimumJumps {

    static int minJumps(int[] arr) {
        // your code here
        int n = arr.length;
        if(n == 0)return 0;
        if(arr[0] == 0) return -1;

        int pos = 0;
        int jump = 0;
        int dist = 0;

        for(int i=0; i<n; i++){
            dist = Math.max(dist, arr[i] + i);

            if(pos == i){
                pos = dist;
                jump++;

                if(pos >= n-1){
                    return jump;
                }
            }
        }
        return -1;
    }

}
