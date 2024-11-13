package LinkedList;

import java.util.HashSet;

public class IntersectionPointInYShapedLinkedLists {


 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class LinkedList
{
    Node head;  // head of list
}

    class Intersect {
        // Function to find intersection point in Y shaped Linked Lists.
        int intersectPoint(Node head1, Node head2) {
            // code here

            HashSet<Node> set = new HashSet<>();
            Node num1 = head1;
            Node num2 = head2;
            while(num1 != null){
                set.add(num1);
                num1 = num1.next;
            }

            while(num2 != null){
                if(set.contains(num2))
                    return num2.data;
                num2 = num2.next;


            }
            return -1;
        }
    }





}
