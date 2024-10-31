package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> list = new ArrayList<>();
            int start = 0;

            for(int i=0; i<nums.length; i++){
                start = nums[i];
                while(i + 1 < nums.length && nums[i+1] - nums[i] == 1){
                    i++;
                }

                if(start != nums[i]){
                    String str = start + "->" + nums[i];
                    list.add(str);
                }else{

                    list.add(String.valueOf(start));
                }
            }
            return list;
        }
    }
}
