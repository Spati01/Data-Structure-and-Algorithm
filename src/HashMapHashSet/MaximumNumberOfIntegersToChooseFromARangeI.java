package HashMapHashSet;

import java.util.HashSet;

public class MaximumNumberOfIntegersToChooseFromARangeI {

    class Solution {
        public int maxCount(int[] banned, int n, int maxSum) {

            HashSet<Integer> set = new HashSet<>();

            for(int num : banned){
                set.add(num);
            }

            int total = 0,  count = 0;

            for(int i=1; i<=n; i++){
                if(!set.contains(i)){
                    total += i;

                    if(total <= maxSum){
                        count++;
                    }else{
                        break;
                    }
                }
            }
            return count;
        }
    }
}
