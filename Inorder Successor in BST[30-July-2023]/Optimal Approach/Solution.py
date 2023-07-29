#  >> PYTHON CODE <<

class Solution:
    def inorderSuccessor(self, root, x):
        ans=None
        
        while(root is not None):
            if(root.data<=x.data):
                root=root.right
            else:
                ans=root
                root=root.left
        
        return ans
