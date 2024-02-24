static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode mergerHead = null;
        SinglyLinkedListNode current = null;
        
        while(head1 != null && head2 != null) {
          // Add head1's node to the merged list
            if(head1.data <= head2.data) {
                if(mergerHead == null) {
                    mergerHead = current = head1;
                } else {
                    current.next = head1;
                    current = current.next;
                }
                head1 = head1.next;
            } else {
                // Add head2's node to the merged list
                    if(mergerHead == null) {
                        mergerHead = current = head2;
                    } else {
                        current.next = head2;
                        current = current.next;
                    }
                    head2 = head2.next;
                
            }
        }
        if(head1 != null) current.next = head1;
        if(head2 != null) current.next = head2;
        return mergerHead;


    }
