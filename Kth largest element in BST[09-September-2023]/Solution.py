#  >> PYTHON CODE <<

class Solution:
    def kthLargest(self,root, k):
        def solve(root,ans,k):
            if(not root): return
        
            solve(root.right,ans,k)
            
            k[0]-=1
            
            if(k[0]==0): ans[0]=root.data
            
            solve(root.left,ans,k)
        
        ans=[-1]
        solve(root,ans,[k])
        
        return ans[0]
