package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class RankTransformOfAnArray {

    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            int n = arr.length;

            HashSet<Integer> set = new HashSet<>();
            for(int i : arr){
                set.add(i);
            }

            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            HashMap<Integer, Integer> map = new HashMap<>();

            int key = 1;
            for(int num : list){
                map.put(num,key++);
            }


            int[] ans = new int[n];
            for(int i=0; i<n; i++){
                ans[i] = map.get(arr[i]);
            }
            return ans;
        }
    }
}
