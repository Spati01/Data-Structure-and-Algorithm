package LinkedList;

import java.util.ArrayList;

public class XORLinkedList {

 class Node {
     int data;
     Node npx;

         Node(int x) {
         data = x;
         npx = null;
     }
 }
    class Solution {
        // function should insert the data to the front of the list
      private Node insert(Node head, int data) {
            // Code Here.
            Node newNode = new Node(data);
            newNode.npx = head;
            return newNode;
        }

        // function to print the linked list
        private  ArrayList<Integer> getList(Node head) {
            // Code Here.
            Node cur = head;
            ArrayList<Integer> list = new ArrayList<>();
            while(cur != null){
                list.add(cur.data);
                cur = cur.npx;
            }
            return list;
        }
    }

}
