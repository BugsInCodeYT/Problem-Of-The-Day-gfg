#  >> PYTHON CODE <<

class Solution:
    def goodSubtrees(self, root, k):
        def solve(root,k,ans):
            if root is None:
                return set()
            
            left=solve(root.left,k,ans)
            right=solve(root.right,k,ans)
            
            left.add(root.data)
            left.update(right)
            
            if(len(left)<=k):
                ans[0]+=1
            
            return left
            
            
        ans=[0]
        solve(root,k,ans)
        
        return ans[0]