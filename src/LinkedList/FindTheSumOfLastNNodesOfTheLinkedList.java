package LinkedList;

public class FindTheSumOfLastNNodesOfTheLinkedList {



    class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }



    class Solution {

        // Return the sum of last k nodes
        public int sumOfLastN_Nodes(Node head, int n) {
            // write code here

            Node temp = reverse(head);
            int ans = 0;
            while(temp != null && n > 0){
                ans += temp.data;
                n--;
                temp = temp.next;
            }

            return ans;
        }
        private Node reverse(Node head){
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
