package Sorting;

public class MergeSortLinkedList {


      public class ListNode {
          int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode sortList(ListNode head) {
            return Divide(head);
        }

        private ListNode Divide(ListNode head){

            if(head == null || head.next == null)return head;

            ListNode mid = getMid(head);
            ListNode left = head;
            ListNode right =mid.next;
            mid.next = null;
            return mergeSort(Divide(left),Divide(right));
        }
        private ListNode mergeSort(ListNode temp, ListNode cur){
            ListNode dummy = new ListNode(0);
            ListNode res = dummy;

            while( temp != null && cur != null){
                if(temp.val < cur.val){
                    res.next = temp;
                    temp = temp.next;
                }else{
                    res.next = cur;
                    cur = cur.next;
                }
                res = res.next;
            }

            while(temp != null){
                res.next = temp;
                temp = temp.next;
                res = res.next;
            }
            while(cur != null){
                res.next = cur;
                cur = cur.next;
                res = res.next;
            }
            return dummy.next;
        }

        private ListNode getMid(ListNode head){
            if(head == null || head.next == null)return head;
            ListNode fast = head;
            ListNode slow = head;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    }
}
