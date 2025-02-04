package LinkedList;

public class RemoveDuplicatesFromASortedDoublyLinkedList {

    class Node{

        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
            prev = next = null;
        }

    }


    class Solution{
        Node removeDuplicates(Node head){
            // Code Here.
            Node cur = head;
            Node temp = null;

            while(cur.next != null){
                if(cur.data == cur.next.data){
                    cur.next = cur.next.next;
                }else{
                    temp = cur;
                    cur = cur.next;
                    cur.prev = temp;
                }
            }
            return head;
        }
    }


}
