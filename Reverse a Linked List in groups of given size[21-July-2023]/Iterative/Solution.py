#  >> PYTHON ITERATIVE APPROACH

class Solution:
    def reverse(self,head, k):
        def reverseList(head):
            prev=None
            next=None
            ptr=head
            
            while(ptr):
                next=ptr.next
                ptr.next=prev
                prev=ptr
                ptr=next
        
            return prev
            
        nn=head
        ans=Node(-1)
        ansPtr=ans
        
        while(nn!=None):
            start=nn
            end=nn
            
            cnt=k
            while(end!=None and cnt!=1):
                end=end.next
                cnt-=1
            
            if(end!=None):
                nn=end.next
                end.next=None
            else:
                nn=None
            ansPtr.next=reverseList(start)
            ansPtr=start
        
        return ans.next