package LinkedList;

import java.util.HashSet;

public class DeleteNodesFromLinkedListPresentInArray {


    // Definition for singly-linked list.
    public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        while(cur != null){
            if(!set.contains(cur.val)){
                res.next = cur;
                res = res.next;
            }

            cur = cur.next;
            res.next = null;
        }
        return dummy.next;
    }
}
