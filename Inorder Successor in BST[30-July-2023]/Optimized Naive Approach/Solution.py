#  >> PYTHON CODE: APPROACH 1 <<

import sys
sys.setrecursionlimit(100000000)
class Solution:
    # returns the inorder successor of the Node x in BST (rooted at 'root')
    def inorderSuccessor(self, root, x):
        def inorder(root,x,found,ans):
            if(not root): return;
            
            inorder(root.left,x,found,ans)
            
            if(found[0]==True):
                ans[0]=root
                found[0]=False
            if(root.data==x.data): found[0]=True
            
            inorder(root.right,x,found,ans)
            
        found=[False]
        ans=[None]
        
        inorder(root,x,found,ans)

        return ans[0]