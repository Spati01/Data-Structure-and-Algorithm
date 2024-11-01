package HashMapHashSet;

import java.util.HashSet;

public class DistributeCandies {

    class Solution {
        public int distributeCandies(int[] candyType) {
            HashSet<Integer> set = new HashSet<>();
            for(int candie : candyType){
                set.add(candie);
            }
            int n = candyType.length / 2;
            return set.size() >= n ? n : set.size();
        }
    }
}
