package Matrix;

import java.util.ArrayList;

public class SpirallyTraversingAMatrix {

    static ArrayList<Integer> spirallyTraverse(int matrix[][])
    {
        // code here
        int r= matrix.length;
        int c = matrix[0].length;
        ArrayList<Integer> result = new ArrayList<>();

        int top=0, left=0, right = c-1, bottom= r-1;

        while(top<=bottom && right>= left){

            // first row
            for(int col= left; col<=right; col++)
                result.add(matrix[top][col]);
            // update top
            top++;

            // rightmost column; row<=bottom will check top>r condition
            for(int row=top; row<=bottom; row++)
                result.add(matrix[row][right]);

            // update right
            right--;

            // bottom and also check whether 1 row left

            if(top<= bottom){

                for(int col= right; col>=left; col--)
                    result.add(matrix[bottom][col]);
                // update bottom
                bottom--;


            }

            // left and also check whether 1  column left
            if(left<=right){

                for(int row=bottom; row>=top; row--)
                    result.add(matrix[row][left]);
                // update bottom
                left++;
            }

        }

        return result;
    }

}
