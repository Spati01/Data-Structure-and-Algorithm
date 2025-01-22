package LinkedList;






public class AddNumberLinkedLists {


/*
    class Node {
        int data;
        LinkedList.Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    */


    class Solution {

        static Node addTwoLists(Node num1, Node num2) {
            // code here

            Node node1 = reverse(num1);
            Node node2 = reverse(num2);

            int carry = 0;


            Node dummy = new Node(0);
            Node res = dummy;


            while(node1 != null || node2 != null || carry != 0){


                int val1 = 0;
                int val2 = 0;

                if(node1 != null) val1 += node1.data;
                if(node2 != null) val2 += node2.data;

                int sum = val1 + val2 + carry;
                int digit = sum % 10;
                carry = sum / 10;

                res.next = new Node(digit);
                res = res.next;

                if(node1 != null) node1 = node1.next;
                if(node2 != null) node2 = node2.next;
            }

            Node result = reverse(dummy.next);
            while(result != null){
                if(result.data != 0)
                    break;
                result = result.next;

            }



            return result;

        }

        private static Node reverse(Node head){
            Node pre = null;
            Node cur = head;
            Node nxt = null;

            while(cur != null){
                nxt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nxt;
            }

            return pre;
        }
    }
}
