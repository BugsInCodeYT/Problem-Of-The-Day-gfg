//   >> JAVA CODE <<

class GfG
{
    Node deleteNode(Node head, int x)
    {
	    if(x==1) return head.next;
	    
	    Node ptr=head;
	    Node prev=null;
	    
	    while(x>1)
	    {
	        prev=ptr;
	        ptr=ptr.next;
	        x-=1;
	    }
	    
	    prev.next=ptr.next;
	    
	        return head;
    }
}