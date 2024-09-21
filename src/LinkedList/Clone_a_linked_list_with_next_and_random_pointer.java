package LinkedList;

public class Clone_a_linked_list_with_next_and_random_pointer {
    // Definition for a Node.

    class Node {
        int data;
        Node next, random;

        Node(int d)
        {
            data = d;
            next = random = null;

        }
    }

    class Solution {
        // Function to clone a linked list with next and random pointer.
        Node copyList(Node head) {


            // your code here
            if(head == null) return null;
            Node cur = head;
            while(cur != null){
                Node temp = cur.next;
                cur.next = new Node(cur.data);
                cur.next.next = temp;
                cur = temp;
            }
            cur = head;

            while(cur != null){
                if(cur.next != null){
                    cur.next.random = (cur.random != null) ? cur.random.next : null;

                }
                cur = cur.next.next;

            }

            Node org = head;
            Node copy = head.next;
            Node temp = copy;

            while(org != null){
                org.next = (org.next != null) ?  org.next.next : null;
                copy.next = (copy.next != null) ?  copy.next.next : null;

                org = org.next;
                copy = copy.next;
            }

            return temp;

        }
    }

}
