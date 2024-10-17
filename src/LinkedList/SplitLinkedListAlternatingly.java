package LinkedList;

public class SplitLinkedListAlternatingly {


    // ********* Method 1 ******



    class Node
    {
        int data;
        Node next;

        Node(int x){
        data = x;
        next = null;
    }

    };


    class Solution0 {
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

 // ****** Method 2  *********
    class Solution {
        // Function to append a new node with newData at the end of a linked list
        Node[] alternatingSplitList(Node head) {
            // code here

            Node[] node = new Node[2];
            Node temp1 = head;
            Node temp2 = head.next;

            node[0] = temp1;
            node[1] = temp2;

            while(temp2!=null && temp2.next != null){
                temp1.next = temp2.next;
                temp1 = temp1.next;
                temp2.next = temp1.next;
                temp2 = temp2.next;
            }
            temp1.next = null;

            return node;

        }
    }

    }


