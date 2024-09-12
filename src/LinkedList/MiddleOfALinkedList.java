package LinkedList;

public class MiddleOfALinkedList {


    class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }


    class Solution {
        int getMiddle(Node head) {
            // Your code here.
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }


            return slow.data;
        }
    }

}
