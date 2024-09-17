package BitManipulation;

public class OddEvenLinkedList {


      public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {

            ListNode oddNode = new ListNode(0);
            ListNode odd = oddNode;
            ListNode evenNode = new ListNode(0);
            ListNode even = evenNode;
            int count = 0;
            ListNode cur = head;

            while(cur != null){
                count++;
                if((count & 1) == 1){

                    odd.next = cur;
                    odd = odd.next;

                }else{
                    even.next = cur;
                    even = even.next;

                }
                cur = cur.next;
            }
            odd.next = evenNode.next;
            even.next = null;

            return oddNode.next;
        }
    }


}
