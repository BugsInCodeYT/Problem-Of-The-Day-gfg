#  >> PYTHON CODE <<

class Solution:
    def union(self, head1,head2):
        def merge(a,b):
            if(a is None): return b
            if(b is None): return a
            
            ans=None
            
            if(a.data<b.data):
                ans=a
                ans.next=merge(a.next,b)
            elif b.data<a.data:
                ans=b
                ans.next=merge(a,b.next)
            else:
                ans=a
                ans.next=merge(a.next,b.next)
                
            return ans
            
        def sort(head):
            if (head is None) or (head.next is None):
                return head
            
            slow=head
            fast=head.next
            
            while((fast is not None) and (fast.next is not None)):
                fast=fast.next.next
                slow=slow.next
            
            
            mid=slow
            nextToMid=mid.next
            mid.next=None
            
            first=sort(head)
            second=sort(nextToMid)
            
            ans=merge(first,second)
            
            return ans
            
        ptr=head1
        
        while ptr.next is not None:
            ptr=ptr.next
        
        ptr.next=head2
        ptr=head1
        ans=head1
        
        while(ptr.next is not None):
            ptr=ptr.next
        
        tail=ptr
        
        finalAns=sort(ans)
        
        return finalAns