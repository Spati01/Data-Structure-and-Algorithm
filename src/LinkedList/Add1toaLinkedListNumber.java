package LinkedList;


class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class Add1toaLinkedListNumber {

    public Node addOne(Node head) {


        Node r  = reverse(head);
        int carry = 1;
        Node curr = r,pre = null;


        while (curr != null) {
            curr.data += carry;
            carry = curr.data / 10;
            curr.data %= 10;
            pre = curr;
            curr = curr.next;

        }
        if(carry > 0) pre.next = new Node(carry);


        return reverse(r);

    }

    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
