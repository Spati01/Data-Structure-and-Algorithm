package LinkedList;







public class DeleteAllOccurrencesOfAGivenKeyInADoublyLinkedList {


    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = prev = null;
        }
    }




    class Solution {

         Node deleteAllOccurOfX(Node head, int x) {
            // Write your code here
            Node dummy = new Node(0);
            dummy.next = head;
            Node cur = head;
            Node prev = dummy;

            while(cur != null){
                if(cur.data == x){
                    prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = prev;
                    }
                    cur = prev.next;
                }else{
                    prev = cur;
                    cur = cur.next;
                }
            }

            return dummy.next;
        }
    }
}
