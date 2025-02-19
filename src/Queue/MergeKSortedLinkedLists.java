package Queue;

import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLinkedLists {

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


// arr is an array of Nodes of the heads of linked lists

    class Solution {
        // Function to merge K sorted linked list.
        Node mergeKLists(List<Node> arr) {
            // Add your code here.

            PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

            for(Node node : arr){
                if(node != null){
                    pq.offer(node);
                }
            }

            Node dummy = new Node(-1);
            Node res = dummy;

            while(!pq.isEmpty()){
                Node min_node = pq.poll();
                res.next = min_node;
                res = res.next;

                if(min_node.next != null){
                    pq.offer(min_node.next);
                }
            }

            return dummy.next;
        }
    }
}
