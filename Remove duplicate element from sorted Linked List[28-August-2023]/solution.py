#  >> PYTHON CODE <<

def removeDuplicates(head):
    ans=Node(-1)
    ansptr=ans
    while(head!=None):
        if(head.data!=ansptr.data):
            ansptr.next=head
            ansptr=ansptr.next
        head=head.next
    
    ansptr.next=None
    
    return ans.next
