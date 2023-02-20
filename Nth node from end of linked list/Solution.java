class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int size=0;
    	Node temp=head;
    	while(temp!=null){
    	    temp=temp.next;
    	    size++;
    	}
    	if(n==size){
    	    return head.data;
    	}
    	int i=0;
    	Node curr = head;
    	int toFind =size-n;
    	if(toFind<0){
    	    return -1;
    	}
    	while(i<toFind){
    	    curr=curr.next;
    	    i++;
    	}
    	return curr.data;
    }
}
