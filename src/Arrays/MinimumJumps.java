package Arrays;

public class MinimumJumps {

    class Solution {
        static int minJumps(int[] arr) {
            // code here

            int n = arr.length;
            if(n==0)return 0;
            if(arr[0] == 0)return-1;

            int pos = 0;
            int jump = 0;
            int desc = 0;

            for(int i=0; i<n; i++){
                desc = Math.max(desc, arr[i] + i);

                if(pos == i){
                    pos = desc;
                    jump++;
                    if(pos >= n-1){
                        return jump;
                    }
                }
            }

            return -1;
        }
    }
}
