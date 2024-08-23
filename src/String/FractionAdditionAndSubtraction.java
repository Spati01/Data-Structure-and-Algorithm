package String;

public class FractionAdditionAndSubtraction {

        public String fractionAddition(String expression) {
            int n = expression.length();
            int num = 0;
            int den = 1;
            int i = 0;
            while(i < n){
                int curNum = 0;
                int curDen =  0;
                boolean isNegative = false;
                if(expression.charAt(i) == '-' || expression.charAt(i) == '+'){
                    if(expression.charAt(i) == '-'){
                        isNegative = true;
                    }

                    i++;
                }

                while(i < n && Character.isDigit(expression.charAt(i))){
                    int val = expression.charAt(i) - '0';
                    curNum = curNum * 10 + val;
                    i++;
                }
                if(isNegative) curNum *= -1;
                i++;


                while(i < n && Character.isDigit(expression.charAt(i))){
                    int val = expression.charAt(i) - '0';
                    curDen = curDen * 10 + val;
                    i++;
                }
                num = num * curDen + curNum * den;
                den *= curDen;
            }

            int gcd = Math.abs(findGcd(num,den));
            num /= gcd;
            den /= gcd;

            return num +"/" + den;
        }
        private int findGcd(int num, int den){
            return num == 0 ? den : findGcd(den%num , num);

        }
    }

