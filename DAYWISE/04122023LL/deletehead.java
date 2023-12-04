/****************************************************************

 Following is the linkedList class structure:

 class Node
 {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/


public class Solution {
    public static Node deleteHead(Node head) {
        // Write Your Code Here.
        if(head == null || head.next == null) {
            return null;
        } else {
            head = head.next;
        }
        return head;
    }
      
}
