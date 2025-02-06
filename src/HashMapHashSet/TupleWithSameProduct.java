package HashMapHashSet;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {

    class Solution {
        public int tupleSameProduct(int[] nums) {

            HashMap<Integer,Integer> product = new HashMap<>();
            int n = nums.length;

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    int res = nums[i] * nums[j];
                    product.put(res, product.getOrDefault(res, 0) + 1);
                }
            }
            int ans = 0;
            for(Map.Entry<Integer,Integer> entry : product.entrySet()){
                int key = entry.getKey();
                int value = entry.getValue();

                if(value >= 2){
                    int tuple = (value * (value - 1))/2;
                    ans =  ans + tuple * 8;
                }
            }

            return ans;
        }
    }
}
