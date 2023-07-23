#  >> PYTHON CODE <<

from queue import Queue
class Solution:
    #Function to return list containing elements of right view of binary tree.
    def rightView(self,root):
        ans=[]
        q=Queue()
        
        q.put(root)

        while(not q.empty()):
            size=q.qsize()
            
            for i in range(size):
                nn=q.get()
                
                if(i==size-1): ans.append(nn.data)
                
                if(nn.left): q.put(nn.left)
                if(nn.right): q.put(nn.right)
                
        return ans