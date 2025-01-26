package LinkedList;

public class RemoveloopInLinkedList {

    class Solution {
        // Function to remove a loop in the linked list.
        public static void removeLoop(Node head) {
            // code here
            if(head == null || head.next == null) return;
            Node fast = head;
            Node slow = head;
            Node pre = null;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(fast == slow){

                    fast = head;

                    while(fast != slow){
                        slow = slow.next;
                        fast = fast.next;
                    }



                    while(fast != null){
                        if(fast.next == slow){
                            fast.next = null;
                        }
                        fast = fast.next;
                    }
                    break;

                }

            }


        }
    }
}
