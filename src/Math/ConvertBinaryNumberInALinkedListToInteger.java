package Math;

public class ConvertBinaryNumberInALinkedListToInteger {



     public class ListNode {
          int val;
         ListNode next;
          ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public int getDecimalValue(ListNode head) {

            ListNode temp = head;
            int decimal = 0;

            while(temp != null){
                decimal = (decimal * 2) + temp.val;
                temp = temp.next;
            }

            return decimal;
        }
    }
}
