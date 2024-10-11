package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReorganizeTheArray {


    // TC : O(N)
    // SC : O(N)


    class UsingSpace {
        public List<Integer> rearrange0(List<Integer> arr) {
            // Code here
            ArrayList<Integer> list = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            for (int i : arr) {
                set.add(i);
            }
            for (int i = 0; i < arr.size(); i++) {
                if (set.contains(i)) {
                    list.add(i);
                } else {

                    list.add(-1);
                }
            }

            return list;
        }
    }


    // TC : O(N)
    // SC : O(1)

    class NotUsingSpace {

        public List<Integer> rearrange(List<Integer> arr) {
            // Code here
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.size(); i++){
                list.add(-1);
            }
            for(int i=0; i<arr.size(); i++){
                if(arr.get(i) != -1){
                    list.set(arr.get(i), arr.get(i));
                }
            }

            return list;
        }
    }
}
