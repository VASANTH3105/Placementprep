/****************************************************************

 Following is the class structure of the Node class:

 class Node {
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
 };

 *****************************************************************/
public class Solution {
    public static Node deleteLast(Node list) {
        // Write your code here
      

        Node temp = list;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return list;
    }
}
