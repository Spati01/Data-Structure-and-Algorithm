package LinkedList;

public class RotateALinkedList {


    public Node rotate(Node head, int k) {
        // add code here
        Node pre = head;
        while(pre.next != null){
            pre = pre.next;
        }

        while(k > 0){
            pre.next = head;
            pre = head;
            head = head.next;
            pre.next = null;
            k--;
        }
        return head;
    }
}
