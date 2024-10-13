package LinkedList;

public class DeleteAlternateNodes {

    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    class Solution {
        public void deleteAlt(Node head) {
            // Code Here
            Node dummy = new Node(-1);
            Node res = dummy;

            Node temp = head;
            int count = 0;

            while(temp != null){
                count++;

                if(count % 2 != 0){
                    res.next = temp;
                    res = temp;
                }
                temp = temp.next;
            }
            res.next = null;
        }
    }
}
