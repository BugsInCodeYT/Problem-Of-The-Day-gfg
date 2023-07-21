#   >> PYTHON RECURSIVE APPROACH <<

class Solution:
    def reverse(self,head, k):
        
        if(head==None): return head
        
        prev,next=None,None
        headptr=head
        cnt=k
        while(headptr!=None and cnt!=0):
            next=headptr.next
            headptr.next=prev
            prev=headptr
            headptr=next
            cnt-=1
        
        head.next=self.reverse(headptr,k)
        
        return prev