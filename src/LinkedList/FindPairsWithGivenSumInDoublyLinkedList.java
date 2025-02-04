package LinkedList;

import java.util.ArrayList;

public class FindPairsWithGivenSumInDoublyLinkedList {

    class Node
    {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }

    class Solution {
        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
            // code here

            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            Node left = head;
            Node right = head;

            while(right.next != null){
                right = right.next;
            }

            while(left.data < right.data){

                if((left.data + right.data) < target){
                    left = left.next;
                }else if((left.data + right.data) > target){
                    right = right.prev;

                }else{

                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(left.data);
                    pair.add(right.data);

                    result.add(pair);

                    left = left.next;
                    right = right.prev;
                }
            }






            return result;
        }
    }

}
