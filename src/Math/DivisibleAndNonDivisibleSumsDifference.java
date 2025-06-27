package Math;

public class DivisibleAndNonDivisibleSumsDifference {

    class Solution {
        public int differenceOfSums(int n, int m) {
            int divide = 0;
            int notDivide = 0;
            for(int i=1; i<=n; i++){
                if(i % m == 0){
                    divide += i;
                }else{
                    notDivide += i;
                }
            }

            return notDivide - divide;
        }
    }
}
