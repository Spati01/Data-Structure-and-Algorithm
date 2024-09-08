package LinkedList;

public class SplitLinkedListInParts {


      public class ListNode {
       int val;
        ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode[] splitListToParts(ListNode head, int k) {
            int totalLen = getLength(head);
            ListNode[] ans = new ListNode[k];
            int len = totalLen / k;
            int dis = totalLen % k;

            ListNode cur = head;
            ListNode pre = null;
            int i = 0;
            while(cur!=null && i < k){
                ans[i] = cur;

                for(int j=0; j<len+(dis > 0 ? 1 : 0); j++){
                    pre = cur;
                    cur = cur.next;
                }
                pre.next = null;
                i++;
                dis--;
            }
            return ans;
        }
        private int getLength(ListNode node){
            int count = 0;
            while(node!=null){
                count++;
                node = node.next;
            }
            return count;
        }
    }


}
