package Matrix;

import java.util.*;


public class RotatingTheBox {

    class Solution {
        public char[][] rotateTheBox(char[][] box) {
            int row = box.length;
            int col = box[0].length;

            char[][] res = new char[col][row];
            for(char[] ch : res){
                Arrays.fill(ch,'.');
            }

            for(int r=0; r<row; r++){
                int i = col - 1;
                for(int c=col-1; c>= 0; c--){
                    if(box[r][c] == '#'){
                        res[i][row-r-1] = '#';
                        i--;
                    }else if(box[r][c] == '*'){
                        res[c][row-r-1] = '*';
                        i = c - 1;
                    }
                }
            }
            return res;
        }
    }
}
