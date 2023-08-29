#  >> PYTHON CODE <<

class Solution:
    def compute(self,head):
        def reverse(head):
            prev,next=None,None
            
            while(head!=None):
                next=head.next
                head.next=prev
                prev=head
                head=next
            
            return prev
        
        rev=reverse(head)
        
        ans=Node(-1)
        ptr=ans
        
        while(rev!=None):
            if(rev.data>=ptr.data):
                ptr.next=rev
                ptr=ptr.next
            rev=rev.next

        ptr.next=None
    
        return reverse(ans.next)
