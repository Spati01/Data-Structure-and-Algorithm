package Arrays;

import java.util.HashSet;

public class MissingAndRepeating {


    class Solve {
        int[] findTwoElement(int arr[]) {



            return new int[]{repeating(arr), missing(arr)};
        }

        private int missing(int[] arr){
            int n = arr.length;
            HashSet<Integer> set = new HashSet<>();


            for (int i : arr) {
                set.add(i);
            }


            for (int i = 1; i <= n; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }

            return 0;

        }



        private int repeating(int[] arr) {
            HashSet<Integer> set = new HashSet<>();


            for (int i : arr) {
                if (set.contains(i)) {
                    return i;
                } else {
                    set.add(i);
                }
            }

            return 0;

        }
    }
}
