/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while(head!=null) {
            ListNode next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
        
    }
}

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
 }

 *****************************************************************/

public class Solution
{
    public static Node reverseLinkedList(Node head)
    {

        // Write your code here.

        Node current=head;

        Node prev=null;

        Node next;

        while(current!=null)

        {

            next=current.next;

            current.next=prev;

            prev=current;

            current=next;

        }

        head=prev;

 

        return head;

    }

}
