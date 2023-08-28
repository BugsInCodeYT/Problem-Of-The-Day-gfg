// >> JAVA CODE <<

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    Node ans=new Node(-1);
	    Node ansptr=ans;
	    while(head!=null)
	    {
	        if(head.data!=ansptr.data)
	        {
	            ansptr.next=head;
	            ansptr=ansptr.next;
	        }
	        
	        head=head.next;
	    }
	    
	    ansptr.next=null;
	    
	        return ans.next;
    }
}