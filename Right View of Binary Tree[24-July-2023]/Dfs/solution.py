#  >> PYTHON CODE <<

from queue import Queue
class Solution:
    #Function to return list containing elements of right view of binary tree.
    def rightView(self,root):
        def solve(root,ans,level,max_level):
            if(not root): return
        
            if(max_level[0]<level):
                ans.append(root.data)
                max_level[0]=level
            
            solve(root.right,ans,level+1,max_level)
            solve(root.left,ans,level+1,max_level)
        
        
        max_level=[0]
        ans=[]
        solve(root,ans,1,max_level)
        
        return ans