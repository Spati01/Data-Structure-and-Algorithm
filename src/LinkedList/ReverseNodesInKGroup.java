package LinkedList;

public class ReverseNodesInKGroup {

      public class ListNode {
          int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {

            if(head == null || head.next == null || k == 1)return head;
            ListNode s = head;
            ListNode e = head;
            int n = k - 1;

            while(n-->0){
                e = e.next;
                if(e == null) return head;

            }

            ListNode node = reverseKGroup(e.next, k);
            reverseNode(s, e);
            s.next = node;

            return e;

        }

        private void reverseNode(ListNode s, ListNode e){

            ListNode pre = null;
            ListNode cur = s;
            ListNode nxt = s.next;

            while(pre != e){
                cur.next = pre;
                pre = cur;
                cur = nxt;

                if(nxt != null)nxt = nxt.next;
            }
        }
    }
}
