package String;

public class AddBinaryStrings {



    class Solution {
        public String addBinary(String s1, String s2) {
            int max=Math.max(s1.length(),s2.length());
            s1=String.format("%"+max+"s",s1).replace(' ','0');
            s2=String.format("%"+max+"s",s2).replace(' ','0');

            int carry=0;
            StringBuilder sb=new StringBuilder();


            for(int i=s1.length()-1; i>=0; i--){
                int a=s1.charAt(i)-'0';
                int b=s2.charAt(i)-'0';



                int sum=a+b+carry;


                carry=sum/2;


                sum=sum%2;


                sb.append(sum);
            }

            if(carry==1)sb.append(carry);


            while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
                sb.deleteCharAt(sb.length() - 1);
            }


            return sb.reverse().toString();
        }
    }
}
