package Arrays;

import java.util.ArrayList;

public class AlternatePositiveAndNegativeNumbers {


    class Solution {
        void rearrange(ArrayList<Integer> arr) {
            // code here
            ArrayList<Integer> pos = new ArrayList<>();
            ArrayList<Integer> neg = new ArrayList<>();

            for(int num : arr){
                if(num >= 0){
                    pos.add(num);
                }else{
                    neg.add(num);
                }
            }

            arr.clear();

            int posi = 0;
            int nega = 0;


            while(posi < pos.size() && nega < neg.size()){
                arr.add(pos.get(posi++));
                arr.add(neg.get(nega++));
            }


            while(posi < pos.size()){
                arr.add(pos.get(posi++));
            }
            while(nega < neg.size()){
                arr.add(neg.get(nega++));
            }

        }
    }



}
