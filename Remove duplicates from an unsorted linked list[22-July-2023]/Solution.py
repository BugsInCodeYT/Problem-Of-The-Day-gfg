#  >> PYTHON CODE <<

class Solution:
    #Function to remove duplicates from unsorted linked list.
    def removeDuplicates(self, head):
        ansList=Node(-1)
        ansptr=ansList
        st=set()
        
        while(head):
            if(head.data not in st):
                st.add(head.data)
                ansptr.next=head
                ansptr=ansptr.next
            
            head=head.next

        ansptr.next=None
        
        return ansList.next
   