package LinkedList;

public class SplitLinkedListAlternatingly {




    class Node
    {
        int data;
        Node next;

        Node(int x){
        data = x;
        next = null;
    }

    };


    class Solution {
        // Function to append a new node with newData at the end of a linked list
        Node[] alternatingSplitList(Node head) {
            // code here

            Node[] node = new Node[2];

            int count = 0;
            Node temp = head;

            Node oddTail = null;
            Node evenTail = null;


            while(temp != null){
                Node newNode = new Node(temp.data);
                if(count % 2 == 0){
                    if(node[0] == null){
                        node[0] = newNode;
                        oddTail = newNode;
                    }else{
                        oddTail.next = newNode;
                        oddTail = newNode;
                    }
                }else{

                    if(node[1] == null){
                        node[1] = newNode;
                        evenTail = newNode;
                    }else{
                        evenTail.next = newNode;
                        evenTail = newNode;
                    }
                }
                count++;
                temp = temp.next;
            }

            return node;

        }

    }






}
