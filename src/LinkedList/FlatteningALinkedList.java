package LinkedList;

public class FlatteningALinkedList {


    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }


    class Solution {
        // Function to flatten a linked list
        Node flatten(Node root) {
            // code here
            if(root == null || root.next == null)return root;

            Node merge = flatten(root.next);

            return mergeNode(root, merge);
        }

        private Node mergeNode(Node node1, Node node2){

            Node dummy = new Node(-1);
            Node res = dummy;

            while(node1 != null && node2 != null){
                if(node1.data < node2.data){
                    res.bottom = node1;
                    res = node1;
                    node1 = node1.bottom;
                }else{
                    res.bottom = node2;
                    res = node2;
                    node2 = node2.bottom;
                }

                res.next = null;
            }

            if(node1 != null) res.bottom = node1;
            else res.bottom = node2;

            return dummy.bottom;
        }
    }
}
