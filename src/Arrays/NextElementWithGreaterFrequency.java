package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import java.util.*;

public class NextElementWithGreaterFrequency {

    class Solution {
        public ArrayList<Integer> findGreater(int[] arr) {
            // code here
            int n = arr.length;
            int[] res = new int[n];
            Arrays.fill(res, -1);
            HashMap<Integer, Integer> map = new HashMap<>();
            Stack<Integer> st = new Stack<>();

            ArrayList<Integer> result = new ArrayList<>();



            for(int i=0; i<n; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            for(int i=0; i<n; i++){
                while(!st.isEmpty() && map.get(arr[st.peek()]) < map.get(arr[i])){
                    res[st.pop()] = arr[i];
                }


                st.push(i);
            }

            for(int val : res) result.add(val);



            return result;

        }
    }
}
