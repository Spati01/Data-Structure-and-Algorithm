package Arrays;

public class PoliceAndThieves {



    class Solution {
        public int catchThieves(char[] arr, int k) {
            // code here
            int n = arr.length;
            int arrest = 0;

            int police = 0;
            int thief = 0;

            while(police < n && thief < n){
                while(police < n && arr[police] != 'P')police++;
                while(thief < n && arr[thief] != 'T')thief++;

                if(police < n && thief < n){
                    if(Math.abs(police - thief) <= k){
                        police++;
                        thief++;
                        arrest++;
                    }else if(thief < police){
                        thief++;
                    }else{
                        police++;
                    }
                }
            }

            return arrest;

        }

    }
}
