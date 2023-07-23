#   >> PYTHON CODE <<

class Solution:
    #Function to sort a linked list of 0s, 1s and 2s.
    def segregate(self, head):
        zeroList, oneList, twoList = Node(-1), Node(-1), Node(-1)
        zeroptr, oneptr, twoptr = zeroList, oneList, twoList
        
        while(head):
            if(head.data==0):
                zeroptr.next=head
                zeroptr=zeroptr.next
            elif(head.data==1):
                oneptr.next=head
                oneptr=oneptr.next
            else:
                twoptr.next=head
                twoptr=twoptr.next;
            
            head=head.next
        
        if(zeroList.next!=None):
            if(oneList.next!=None):
                zeroptr.next=oneList.next
                oneptr.next=twoList.next
            else:
                zeroptr.next=twoList.next
        
            twoptr.next=None
        
            return zeroList.next
        elif oneList.next!=None:
            oneptr.next=twoList.next
            twoptr.next=None
            
            return oneList.next
        else:
            twoptr.next=None
            return twoList.next