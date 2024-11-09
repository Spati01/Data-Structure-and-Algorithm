package Arrays;

import java.util.*;


public class MinimumSum {

    class Solution {
        String minSum(int[] arr) {
            // code here
            Arrays.sort(arr);

            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();

            int k = 0;
            while(k < arr.length){
                if(k % 2 == 0){
                    num1.append(arr[k++]);
                }else{
                    num2.append(arr[k++]);
                }
            }


            StringBuilder ans = new StringBuilder();
            int i = num1.length()-1;
            int j = num2.length()-1;
            int carry = 0;
            while(i >= 0 || j >= 0 || carry > 0){
                int digit1 = (i >= 0) ? num1.charAt(i--)- '0' : 0;
                int digit2 = (j >= 0) ? num2.charAt(j--)- '0' : 0;

                int sum = digit1 + digit2 + carry;
                carry = sum / 10;
                sum %= 10;
                ans.append(sum);
            }

            ans.reverse();

            while(ans.length() > 1 && ans.charAt(0) == '0'){
                ans.deleteCharAt(0);
            }



            return ans.toString();

        }
    }


}
