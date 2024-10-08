package LinkedList;

public class InsertGreatestCommonDivisorsInLinkedList {



     public class ListNode {
     int val;
         ListNode next;
         ListNode() {}
     ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode pre = head;
            ListNode cur = pre.next;
            while(cur != null){
                int data = gcd(pre.val, cur.val);
                ListNode newNode = new ListNode(data);
                if(cur != null){
                    pre.next = newNode;
                    newNode.next = cur;
                }
                pre = cur;
                cur = cur.next;

            }

            return head;
        }
        private int gcd(int a, int b){
            return b==0 ? a : gcd(b,a%b);
        }
    }
}
