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

    public static Node insertEnd(Node head, int k) {

        // Write Your Code Here.

        Node newNode=new Node(k);

        if (head==null) {

            head=newNode;

        }

        else{

           Node temp=head;  

           while(temp.next!=null){

                temp=temp.next;

            }

            temp.next=newNode; 

        } 

        return head;

    }

}
