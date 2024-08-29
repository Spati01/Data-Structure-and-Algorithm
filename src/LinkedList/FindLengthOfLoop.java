package LinkedList;

public class FindLengthOfLoop {

    public int countNodesinLoop(Node head) {
        // Add your code here.
        int count = 0;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                slow=slow.next;
                count++;


                while(slow != fast){
                    slow = slow.next;
                    count++;
                }
                break;
            }
        }
        return count;
    }
}
