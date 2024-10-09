package LinkedList;

public class LinkedListMatrix {



class Node
{
   int data;
   Node right,down;

   Node(int data){
       this.data = data;
       right = null;
       down = null;
   }
}
    class Solution {
         Node construct(int arr[][]) {
            // Add your code here.
            int n = arr.length;
            if(n == 0)return null;

            Node head = new Node(arr[0][0]);
            Node[][] nodes = new Node[n][n];
            nodes[0][0] = head;
            for(int i=0;i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==0 && j == 0)continue;


                    nodes[i][j] = new Node(arr[i][j]);
                    if(j > 0){
                        nodes[i][j-1].right = nodes[i][j];
                    }
                    if(i > 0){
                        nodes[i-1][j].down = nodes[i][j];
                    }
                }
            }
            return head;
        }
    }
}
