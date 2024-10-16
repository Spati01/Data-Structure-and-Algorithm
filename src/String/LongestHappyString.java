package String;

import java.util.PriorityQueue;

public class LongestHappyString {

    class Solution {

        class Pair{
            char val;
            int count;

            Pair(char val, int count){
                this.val = val;
                this.count = count;
            }
        }
        public String longestDiverseString(int a, int b, int c) {
            PriorityQueue<Pair> pq = new PriorityQueue<>((x, y)-> y.count - x.count);
            StringBuilder sb = new StringBuilder();

            if(a > 0) pq.add(new Pair('a',a));
            if(b > 0) pq.add(new Pair('b',b));
            if(c > 0) pq.add(new Pair('c',c));

            int[] pairInfo = new int[]{0,0};

            while(!pq.isEmpty()){
                Pair p = pq.poll();
                if (pairInfo[0] != (p.val - 'a')){
                    pairInfo[0] = p.val - 'a';
                    pairInfo[1] = 1;
                    sb.append(p.val);
                    p.count--;
                }else if(pairInfo[1] + 1 < 3){
                    pairInfo[1]++;
                    sb.append(p.val);
                    p.count--;
                }else if(!pq.isEmpty()){
                    Pair p1 = pq.poll();
                    pairInfo[0] = p1.val - 'a';
                    pairInfo[1] = 1;
                    sb.append(p1.val);
                    p1.count--;
                    if(p1.count > 0){
                        pq.add(p1);
                    }
                }else{
                    break;
                }
                if(p.count > 0){
                    pq.add(p);
                }
            }
            return sb.toString();
        }
    }
}
