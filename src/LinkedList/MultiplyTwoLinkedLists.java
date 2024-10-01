package LinkedList;

public interface MultiplyTwoLinkedLists {

    class Node
    {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next = null;
        }
    }

    class Solution {
        public long multiplyTwoLists(Node first, Node second) {
            // Code here
            long nums1 = 0;
            long nums2 = 0;
            long  MOD = 1000000007;
            while(first != null || second != null){
                if(first != null){
                    nums1 = ((nums1 * 10) + first.data)%MOD;
                    first =  first.next;
                }

                if(second != null){
                    nums2 = ((nums2 * 10) + second.data)%MOD;
                    second = second.next;
                }
            }

            return (nums1 * nums2)%MOD;

        }
    }
}
