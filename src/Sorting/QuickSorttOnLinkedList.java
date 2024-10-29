package Sorting;

public class QuickSorttOnLinkedList {

    class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }

    }
    // you have to complete this function
    class GfG {
        public static Node quickSort(Node node) {
            // Your code here
            Node tail = getTail(node);
            quickShortHelper(node, tail);
            return node;
        }

        private static void quickShortHelper(Node head, Node tail){
            if(head == null || tail == head)return;
            Node pivot = partition(head, tail);
            quickShortHelper(head, pivot);
            quickShortHelper(pivot.next,tail);
        }

        private static Node partition(Node head, Node tail){

            Node pivot = head;
            Node pre = head;
            Node cur = head;

            while(cur != tail.next){
                if(cur.data < pivot.data){
                    int temp = cur.data;
                    cur.data = pre.next.data;
                    pre.next.data = temp;

                    pre = pre.next;
                }
                cur = cur.next;
            }
            // int temp = pivot.data;
            // pivot.data = pre.data;
            // pre.data = temp;
            swap(pivot,pre);

            return pre;
        }

        private static Node getTail(Node temp){

            while(temp != null && temp.next != null){
                temp = temp.next;
            }
            return temp;
        }
        private static void swap(Node x, Node y){
            int temp = x.data;
            x.data = y.data;
            y.data = temp;
        }

    }
}
