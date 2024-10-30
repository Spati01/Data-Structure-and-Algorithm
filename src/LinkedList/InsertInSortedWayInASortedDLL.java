package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class InsertInSortedWayInASortedDLL {



    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    class Solution {
        public Node sortedInsert(Node head, int x) {
            // add your code here
            ArrayList<Integer> list = new ArrayList<>();

            while(head != null){
                list.add(head.data);
                head = head.next;
            }
            list.add(x);
            Collections.sort(list);

            Node node = new Node(0);
            Node res = node;

            for(int i=0; i<list.size(); i++){
                res.next = new Node(list.get(i));
                res = res.next;
            }
            return node.next;

        }
    }
}
