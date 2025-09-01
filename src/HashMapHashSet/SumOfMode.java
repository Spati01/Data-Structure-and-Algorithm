package HashMapHashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Solution {
    public int sumOfModes(int[] arr, int k) {
        // code here

        int n = arr.length;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        TreeSet<int[]> set = new TreeSet<>(

                (a,b) -> (a[0] != b[0]) ? Integer.compare(a[0], b[0])
                        : Integer.compare(a[1] , b[1]));


        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }


        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            set.add(new int[]{x.getValue(), -x.getKey()});
        }

        int mode = -set.last()[1];

        sum += mode;

        for(int i=k; i<n; i++){
            int out = arr[i-k];
            int in = arr[i];

            int outFreq = map.get(out);

            set.remove(new int[]{outFreq, -out});

            map.put(out, outFreq - 1);

            if(map.get(out) > 0)set.add(new int[]{map.get(out), -out});
            else map.remove(out);

            map.put(in, map.getOrDefault(in, 0) + 1);

            set.add(new int[]{map.get(in), -in});

            mode = -set.last()[1];

            sum += mode;

        }

        return sum;
    }
}