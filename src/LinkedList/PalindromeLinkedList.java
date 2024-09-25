package LinkedList;

public class PalindromeLinkedList {




class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        if(head == null || head.next == null) return true;

        Node cur = head;
        Node nex = getMid(head);
        Node last = Reverse(nex.next);
        while(last != null){
            if(last.data != cur.data){
                return false;
            }

            last = last.next;
            cur = cur.next;
        }


        return true;


    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node Reverse(Node head){

        Node pre = null;
        Node cur = head;
        Node nex = null;

        while(cur != null){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }


        return pre;

    }

}



}
