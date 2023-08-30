#  >> PYTHON CODE <<

def delNode(head, k):
    if(k==1): return head.next
    
    ptr=head
    prev=None
    
    while(k>1):
        prev=ptr
        ptr=ptr.next
        k-=1

    prev.next=ptr.next
    
    return head
