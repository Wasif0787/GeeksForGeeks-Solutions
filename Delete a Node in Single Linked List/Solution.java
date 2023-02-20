class GfG
{
    Node deleteNode(Node head, int position)
    {
	// Your code here	
       if (head == null)
            return head;
  
        // Store head node
        Node temp = head;
  
        // If head needs to be removed
        if (position == 1) {
            head = temp.next; // Change head
            return head;
        }
  
        // Find previous node of the node to be deleted
        int i=1;
        while(i<position-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}
