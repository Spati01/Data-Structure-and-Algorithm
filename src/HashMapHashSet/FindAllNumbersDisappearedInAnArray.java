package HashMapHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;
            List<Integer> list = new ArrayList<>();
            HashSet<Integer> set= new HashSet<>();

            for(int num : nums){
                set.add(num);
            }
            for(int i=1; i<=n; i++){
                if(!set.contains(i)){
                    list.add(i);
                }
            }
            return list;
        }
    }


}
