package String;

import java.util.ArrayList;


public class FindTheClosestPalindrome {

        private long findNearestPalindrome(long firstHelf, boolean isOdd){
            long res = firstHelf;

            if(isOdd){
                firstHelf /= 10;
            }

            while(firstHelf > 0){
                res = res * 10 + (firstHelf%10);
                firstHelf /= 10;
            }
            return res;
        }



        public String nearestPalindromic(String n) {
            ArrayList<Long> list = new ArrayList<Long>();
            int len = n.length();
            boolean isOdd = (len % 2 != 0);

            int mid = (len % 2 == 0) ? (len / 2) : (len / 2 + 1);
            Long firstHalf = Long.parseLong(n.substring(0,mid));
            list.add(findNearestPalindrome(firstHalf, isOdd));
            list.add(findNearestPalindrome(firstHalf + 1, isOdd));
            list.add(findNearestPalindrome(firstHalf - 1, isOdd));
            list.add((long)Math.pow(10,len - 1) -1);
            list.add((long)Math.pow(10,len) + 1);

            long num = Long.parseLong(n);
            long min = Long.MAX_VALUE;
            long res = Long.MAX_VALUE;

            for(Long element : list){
                if(element == num) continue;
                long curDeff = Math.abs(element - num);
                if(curDeff < min){
                    res = element;
                    min = curDeff;


                }else if(curDeff == min){
                    res = Math.min(res, element);
                }

            }
            return String.valueOf(res);
        }
    }




