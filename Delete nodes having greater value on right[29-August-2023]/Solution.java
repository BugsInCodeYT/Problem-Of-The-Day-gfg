//  >> JAVA CODE <<

class Solution
{
    Node reverse(Node head)
    {
        Node prev=null,next=null;
        
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
            
            return prev;
    }
    Node compute(Node head)
    {
        Node rev=reverse(head);
        Node ans=new Node(-1);
        Node ptr=ans;
        
        while(rev!=null)
        {
            if(rev.data>=ptr.data)
            {
                ptr.next=rev;
                ptr=ptr.next;
            }
            
            rev=rev.next;
        }
        
        ptr.next=null;
        
        return reverse(ans.next);
    }
}