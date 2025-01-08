package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    class Solution {
        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> list = new ArrayList<>();

            for(int i=1; i<=numRows; i++){
                list.add(generateRow(i));
            }

            return list;

        }

        private List<Integer> generateRow(int row){

            int ans = 1;

            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int col=1; col<row; col++){

                ans *= (row - col);
                ans /= (col);

                list.add(ans);
            }

            return list;
        }
    }
}
