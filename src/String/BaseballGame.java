package String;

public class BaseballGame {

    class Solution {
        public int calPoints(String[] operations) {

            int[] result = new int[operations.length];
            int sum = 0, c = 0;

            for(int i=0; i<operations.length; i++){
                if(operations[i].equals("+"))result[c++] = result[c-2] + result[c-3];
                else if(operations[i].equals("D"))result[c++] = 2 * result[c-2];
                else if(operations[i].equals("C"))c--;
                else result[c++] = Integer.parseInt(operations[i]);

            }

            for(int i=0; i<c; i++)
                sum += result[i];

            return sum;
        }
    }
}
