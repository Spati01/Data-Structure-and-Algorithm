package LinkedList;

public class DeletionAndReverseInCircularLinkedList {



class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}

    class Solution {
        // Function to reverse a circular linked list
        Node reverse(Node head) {
            // code here
            if (head == null || head.next == null) {
                return head;
            }
            Node pre = head;
            Node cur = head.next;
            Node nex = null;

            while(cur != head){
                nex = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nex;
            }
            cur.next = pre;
            head = pre;


            return head;
        }

        // Function to delete a node from the circular linked list
        Node deleteNode(Node head, int key) {
            // code here

            Node temp = head;
            if (head.data == key) {
                temp.data = temp.next.data;
                temp.next = temp.next.next;
                return head;
            }
            while (temp.next != head) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
            return head;
        }
    }
}
